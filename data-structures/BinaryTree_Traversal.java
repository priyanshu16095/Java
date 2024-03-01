package DataStructure;
import java.util.*;

public class BinaryTree_Traversal {
    static class Node {
        int value;
        Node right;
        Node left;
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int index =  -1;
        Node buildTree(int nodes[]) {
            index++;
            if(nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        void preorder(Node root) {
            // ROOT -> LEFT SUBTREE -> RIGHT SUBTREE | O(N)
            if(root == null) {
                return;
            }
            System.out.print(root.value + " ");
            preorder(root.left);
            preorder(root.right);
        }
        void inorder(Node root) {
            // LEFT SUBTREE -> ROOT -> RIGHT SUBTREE
            if(root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
        void postorder(Node root) {
            // LEFT SUBTREE -> RIGHT SUBTREE -> ROOT
            if(root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.value + " ");
        }
        void levelorder(Node root) {
            if(root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node currentNode = q.remove();
                if(currentNode == null) {
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currentNode.value + " ");
                    if(currentNode.left != null) {
                        q.add(currentNode.left);
                    }
                    if(currentNode.right != null) {
                        q.add(currentNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(root.value);
        System.out.println(root.left.value);
        System.out.println(root.right.value);

        tree.preorder(root);
        System.out.println();

        tree.inorder(root);
        System.out.println();

        tree.postorder(root);
        System.out.println();

        tree.levelorder(root);
        System.out.println();
    }
}