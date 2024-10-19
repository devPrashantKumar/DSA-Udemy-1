package Graph;

public class AdjacencyMatrixClassTest {
    public static void main(String[] args) {
        AdjacencyMatrixClass adjacencyMatrixClass = new AdjacencyMatrixClass(5);
        adjacencyMatrixClass.addUndirectedEdge(0, 1);
        adjacencyMatrixClass.addUndirectedEdge(1, 2);
        adjacencyMatrixClass.addUndirectedEdge(2, 4);
        adjacencyMatrixClass.addDirectedEdge(0, 3);
        adjacencyMatrixClass.printAdjacencyMatrix();
    }
}
