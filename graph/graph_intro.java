package graph;

import java.util.ArrayList;

public class graph_intro {
    public static class Edge {
        // source,neighbour,weight
        int src;
        int nbr;
        int wt;

        public Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void main(String[] args) throws Exception {
        // arrayList of array=adjacency list
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[7];
        for (int i = 0; i < 7; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[1].add(new Edge(1, 0, 10));
        graph[0].add(new Edge(0, 3, 40));
        graph[3].add(new Edge(3, 0, 40));
        graph[1].add(new Edge(1, 2, 10));
        graph[2].add(new Edge(2, 1, 10));
        graph[3].add(new Edge(3, 2, 10));
        graph[2].add(new Edge(2, 3, 10));
        graph[3].add(new Edge(3, 4, 3));
        graph[4].add(new Edge(4, 3, 3));
        graph[4].add(new Edge(4, 6, 7));
        graph[6].add(new Edge(6, 4, 7));
        graph[4].add(new Edge(4, 5, 3));
        graph[5].add(new Edge(5, 4, 3));
        graph[5].add(new Edge(5, 6, 2));
        graph[6].add(new Edge(6, 5, 2));

        for (int i = 0; i < 7; i++) {
            System.out.print(i + " -> ");
            for (Edge e : graph[i]) {
                System.out.print("( " + e.src + ", " + e.nbr + ", " + e.wt + " )");
            }
            System.out.println();
        }

    }
}
