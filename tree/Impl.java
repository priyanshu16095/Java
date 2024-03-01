package Tree;

import java.util.*;

public class Impl {
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
        int index = -1;
        Node buildTree(int[] nodes) {
            index++;
            if(nodes[index] == -1) {
                return null;
            }

            Node node = new Node(nodes[index]);
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }

        // ROOT -> LEFT SUBTREE -> RIGHT SUBTREE
        void preOrder(Node root) {
            if(root == null) {
                return;
            }
            System.out.print(root.value + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // LEFT SUBTREE -> ROOT -> RIGHT SUBTREE
        void inOrder(Node root) {
            if(root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }

        // LEFT SUBTREE -> RIGHT SUBTREE -> ROOT
        void postOrder(Node root) {
            if(root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value + " ");
        }

        void levelOrder(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node currNode= q.remove();
                if(currNode == null) {
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.value + " ");
                    if(currNode.left != null) {
                        q.add(currNode.left);
                    } 
                    if(currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        int nodesCount(Node root) {
            if(root == null) {
                return 0;
            }
            int leftCount = nodesCount(root.left);
            int rightCount = nodesCount(root.right);
            return leftCount + rightCount + 1;
        }

        int sumOfNodes(Node root) {
            if(root == null) {
                return 0;
            }
           
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.left);

            return leftSum + rightSum + root.value;
        }

        int heightOfTree(Node root) {
            if(root == null) {
                return 0;
            }

            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);
            int myHeight = Math.max(leftHeight, rightHeight) + 1;

            return myHeight;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree(nodes);
        
        binaryTree.preOrder(root);
        System.out.println();

        binaryTree.inOrder(root);
        System.out.println();

        binaryTree.postOrder(root);
        System.out.println();

        binaryTree.levelOrder(root);

        System.out.println("Count: " + binaryTree.nodesCount(root));
        System.out.println("Sum : " + binaryTree.sumOfNodes(root));
        System.out.println("Height: " + binaryTree.heightOfTree(root));
    }
}
