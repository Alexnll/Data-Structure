// Simplest implementation of undirected and unweighted graph
// with fixed number of vertex when being constructed
// contains methods for creating a vertex list and an adjacency matrix
class Graph{
    private final int maxVerts;     // max number of vertex in this graph
    private Vertex vertexList[];   // array of vertices
    private int adjMat[][];   // adjacency materix
    private int nVerts;     // current number of vertices

    public Graph(int max){    // constructor
        maxVerts = max;
        vertexList = new Vertex[maxVerts];
        adjMat = new int[maxVerts][maxVerts];
        nVerts = 0;
        for (int i = 0; i < maxVerts; i++){   // set all the values in adjMat to zero
            for (int j = 0; j < maxVerts; j++){
                adjMat[i][j] = 0;
            }
        }
    }

    public void addVertex(char lab){  // argument is label
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end){   // add edge between two vertices
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v){   // display vertex v
        System.out.println(vertexList[v].label);
    }

    public int size(){     
        return maxVerts;
    }

    public int currentSize(){
        return nVerts;
    }

    public static void main(String[] args){
        Graph a = new Graph(10);
        System.out.println(a.size());
    } 
}