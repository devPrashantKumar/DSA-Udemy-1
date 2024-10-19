package Graph;
import java.util.ArrayList;

public class AdjacencyListClass {
    int vertices;
    ArrayList<Integer>[] adjacencyList;

    @SuppressWarnings("unchecked")
    public AdjacencyListClass(int vertices){
        this.vertices=vertices;
        this.adjacencyList = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new ArrayList<Integer>();
        }
    }

    public void addUndirectedEdge(int vertex1, int vertex2){
        adjacencyList[vertex1].add(vertex2);
        adjacencyList[vertex2].add(vertex1);
    }

    public void addDirectedEdge(int from, int to){
        adjacencyList[from].add(to);
    }

    public void printAdjacencyList(){
        for(int i=0;i<adjacencyList.length;i++){
            System.out.print(i+" -> ");
            for(int j=0;j<adjacencyList[i].size();j++){
                System.out.print(adjacencyList[i].get(j)+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
