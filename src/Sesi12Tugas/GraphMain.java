package Sesi12Tugas;

import Sesi12.Graph;

public class GraphMain {
    public static void main(String[] args) {
        Sesi12.Graph graph = new Graph(4);

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');

        graph.addEdge(0, 1);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(2, 0);
        graph.addEdge(0, 3);
        graph.addEdge(3, 0);
        graph.addEdge(1, 3);
        graph.addEdge(3, 1);
        graph.adjacencyMatrix();
        System.out.println();
    }
}