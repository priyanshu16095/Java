import java.util.ArrayList;

public class BFS {
    static class Edge {
        int src;
        int dest;
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int vertices = 4; 
        ArrayList<Edge> graph[] = new ArrayList[vertices];

        for(int i = 0; i < graph[2].size(); i++) {
            System.out.println(graph[2].get(i).dest + " ");
        }
    }
}
