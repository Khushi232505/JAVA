import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>();

    void addEdge(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<Integer>());
        adjList.get(u).add(v);
    }

    // BFS Traversal
    void BFS(int start) {
        Set<Integer> visited = new HashSet<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            List<Integer> neighbors = adjList.get(node);
            if (neighbors != null) {
                for (int n : neighbors) {
                    if (!visited.contains(n)) {
                        visited.add(n);
                        queue.add(n);
                    }
                }
            }
        }
    }

    // DFS Traversal
    void DFSUtil(int v, Set<Integer> visited) {
        visited.add(v);
        System.out.print(v + " ");

        List<Integer> neighbors = adjList.get(v);
        if (neighbors != null) {
            for (int n : neighbors) {
                if (!visited.contains(n)) {
                    DFSUtil(n, visited);
                }
            }
        }
    }

    void DFS(int start) {
        Set<Integer> visited = new HashSet<Integer>();
        DFSUtil(start, visited);
    }
}

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph();

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("BFS starting from vertex 2:");
        g.BFS(2);

        System.out.println("\nDFS starting from vertex 2:");
        g.DFS(2);
    }
}
