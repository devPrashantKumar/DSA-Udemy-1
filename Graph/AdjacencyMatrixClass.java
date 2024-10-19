package Graph;

public class AdjacencyMatrixClass {
    int[][] adjacencyMatrix;
    int vertices;

    public AdjacencyMatrixClass(int vertices){
        this.vertices = vertices;
        this.adjacencyMatrix = new int[vertices][vertices];
    }

    public void addUndirectedEdge(int vertex1, int vertex2){
        adjacencyMatrix[vertex1][vertex2]=1;
        adjacencyMatrix[vertex2][vertex1]=1;
    }

    public void addDirectedEdge(int from, int to){
        adjacencyMatrix[from][to]=1;
    }

    public void printAdjacencyMatrix(){
        for(int i=0;i<adjacencyMatrix.length;i++){
            for(int j=0;j<adjacencyMatrix[i].length;j++){
                System.out.print(adjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
