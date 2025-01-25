package DataStructures.Graph;
import java.util.Arrays;
public class AdjacencyMatrixClassTest {
    public static void main(String[] args) {
        AdjacencyMatrixClass adjacencyMatrixClass = new AdjacencyMatrixClass(5);
        adjacencyMatrixClass.addUndirectedEdge(0, 1);
        adjacencyMatrixClass.addUndirectedEdge(1, 2);
        adjacencyMatrixClass.addUndirectedEdge(2, 4);
        adjacencyMatrixClass.addDirectedEdge(0, 3);
        adjacencyMatrixClass.printAdjacencyMatrix();
        System.out.println(Arrays.toString(adjacencyMatrixClass.BFSInAdjacencyMatrix()));
        System.out.println(Arrays.toString(adjacencyMatrixClass.DFSInAdjacencyMatrix()));
        System.out.println(Arrays.toString(adjacencyMatrixClass.BFSInAdjacencyMatrix2()));


    }
}
