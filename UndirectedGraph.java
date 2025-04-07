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

        for(int i = 0; i < vertexData.length; i++) {
            vertexData[i] = "";
        }
    }

    /**
     * Metodo per verificare la validità di un vertice
     * @param vertex vertice da verificare
     * @return true se è valido, false altrimenti
     */
    private boolean isValidVertex(int vertex) {
        return vertex >= 0 && vertex < this.size;
    }

    /**
     * Indica se un arco è valido
     * @param from vertice di partenza
     * @param to vertice di arrivo
     * @return true se l'arco è valido, false altrimenti
     */
    private boolean isValidEdge(int from, int to) {
        return from != to && (adjacencyMatrix[from][to] == 1 || adjacencyMatrix[to][from] == 1);
    }

    /**
     * 
     * @param from
     * @param to
     */
    public void addEdge(int from, int to) {
        if(isValidVertex(from) && isValidVertex(to) && isValidEdge(from, to)) {
            adjacencyMatrix[from][to] = 1;
            adjacencyMatrix[to][from] = 1;
        }
    }

    /**
     * Metodo per rimuovere un arco dal grafo
     * @param from vertice di partenza
     * @param to vertice di arrivo
     */
    public void removeEdge(int from, int to) {
        if(isValidVertex(from) && isValidVertex(to) && isValidEdge(from, to)) {
            adjacencyMatrix[from][to] = 0;
            adjacencyMatrix[to][from] = 0;
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
        for(int i = 0; i < adjacencyMatrix.length; i++) {
            for(int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j]);
            }
            System.out.println("");
        }
    }
}