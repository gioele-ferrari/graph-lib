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
     * Metodo per inizializzare i valori del grafico
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
        return from != to;
    }

    /**
     * Metodo per aggiungere un arco al grafo
     * @param from vertice di partenza
     * @param to vertice di arrivo
     */
    public void addEdge(int from, int to, int weight) {
        if(isValidVertex(from) && isValidVertex(to) && isValidEdge(from, to)) {
            adjacencyMatrix[from][to] = weight;
            adjacencyMatrix[to][from] = weight;
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
     * Metodo per aggiungere un vertice
     * @param vertex indice del vertice
     * @param data dati del vertice
     */
    public void addVertex(int vertex, String data) {
        if(isValidVertex(vertex)) {
            this.vertexData[vertex] = data;
        }
    }

    public String[] getNeighborhood(int vertex) {
        String[] vertexList = new String[size];

        return vertexList;
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