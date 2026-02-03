public class adjacencyMatrix {

    private int[][] matrix;
    private int vertices;

    public adjacencyMatrix(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    void addEdge(int src, int dest) {
        matrix[src][dest] = 1;
        matrix[dest][src] = 1;
    }


    void printMatrix() {
        for(int i=0; i<vertices; i++) {
            for(int j=0; j<vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        adjacencyMatrix obj = new adjacencyMatrix(5);

        obj.addEdge(0, 1);
        obj.addEdge(0, 2);

        obj.addEdge(1, 2);
        obj.addEdge(2, 0);
        obj.addEdge(2, 3);

        obj.printMatrix();
    }

}
