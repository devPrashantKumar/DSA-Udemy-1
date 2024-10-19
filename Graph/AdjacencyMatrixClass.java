package Graph;

import java.util.*;

public class AdjacencyMatrixClass {
    int[][] adjacencyMatrix;
    int vertices;

    public AdjacencyMatrixClass(int vertices) {
        this.vertices = vertices;
        this.adjacencyMatrix = new int[vertices][vertices];
    }

    public void addUndirectedEdge(int vertex1, int vertex2) {
        adjacencyMatrix[vertex1][vertex2] = 1;
        adjacencyMatrix[vertex2][vertex1] = 1;
    }

    public void addDirectedEdge(int from, int to) {
        adjacencyMatrix[from][to] = 1;
    }

    public void printAdjacencyMatrix() {
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[] BFSInAdjacencyMatrix() {
        int[] traversalResult = new int[vertices];
        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[vertices];
        int k = 0;
        for (int v = 0; v < visited.length; v++) {
            if (visited[v] == 0) {
                queue.add(0);
                visited[0] = 1;
                while (!queue.isEmpty()) {
                    Integer vertex = queue.poll();
                    traversalResult[k++] = vertex;
                    for (int i = 0; i < adjacencyMatrix[vertex].length; i++) {
                        if (adjacencyMatrix[vertex][i] != 0 && visited[i] == 0) {
                            queue.add(i);
                            visited[i] = 1;
                        }
                    }
                }
            }
        }
        return traversalResult;
    }
}
