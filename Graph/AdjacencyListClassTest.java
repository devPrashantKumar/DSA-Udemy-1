package Graph;
import java.util.*;

public class AdjacencyListClassTest {
    public static void main(String[] args) {
        AdjacencyListClass adjacencyListClass = new AdjacencyListClass(5);
        adjacencyListClass.addUndirectedEdge(0, 1);
        adjacencyListClass.addUndirectedEdge(1, 2);
        adjacencyListClass.addUndirectedEdge(2, 4);
        adjacencyListClass.addDirectedEdge(0, 3);
        adjacencyListClass.printAdjacencyList();
        System.out.println(Arrays.toString(adjacencyListClass.BFSInAdjacencyList()));
        System.out.println(Arrays.toString(adjacencyListClass.DFSInAdjacencyList()));
    }
}
