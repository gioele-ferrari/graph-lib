import java.util.Arrays;

public class UndirectedGraph {
    private int[][] adjacencyMatrix;
    private String[] vertexData;
    private int size;

    public UndirectedGraph(int size) {
        this.adjacencyMatrix = new int[size][size];
        this.vertexData = new String[size];
        this.size = size;
        initializeGraph();
    }

    /**
     * Metodo per inizializzare gli attributi interni
     */
    private void initializeGraph() {
        for(int[] node_row : adjacencyMatrix) {
            Arrays.fill(node_row, 0);
        }

        for (int i = 0; i < vertexData.length; i++) {
            vertexData[i] = "";
        }
    }

    /**
     * Metodo per verificare che il vertice sia valido
     */
    private boolean isValidVertex(int vertex) {
        return vertex >= 0 && vertex < this.size;
    }

    /**
     * Metodo per aggiungere un arco al grafo
     */
    public void addEdge(int from, int to) {
        if (isValidVertex(from) && isValidVertex(to)) {
            adjacencyMatrix[from][to] = 1;
            adjacencyMatrix[to][from] = 1;
        }
    }

    /**
     * Metodo per aggiungere un vertice al grafo
     */
    public void addVertex(int vertex, String data) {
        if(isValidVertex(vertex)) {
            this.vertexData[vertex] = data;
        }
    }

    /**
     * Metodo per stampare il grafo
     */
    public void printGraph() {
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j]);
            }
            System.out.println("");
        }
    }
}