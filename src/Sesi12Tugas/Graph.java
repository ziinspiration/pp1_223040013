package Sesi12Tugas;

import Sesi12.Vertex;

public class Graph {
    private Sesi12.Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private int maxVerts;

    public Graph(int maxVerts) {
        this.maxVerts = maxVerts;
        vertexList = new Sesi12.Vertex[maxVerts];
        adjMat = new int[maxVerts][maxVerts]; // Initialize the adjacency matrix

        nVerts = 0;
    }

    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void adjacencyMatrix() {
        for(int i = 0; i < adjMat.length; i ++) {
            for(int j = 0; j < adjMat[0].length; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}