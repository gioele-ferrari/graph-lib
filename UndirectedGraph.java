import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    /**
     * Metodo per ottenere i vicini di un vertice
     * @param vertex 
     * @return
     */
    public int[] getNeighbors(int vertex) {
        List<Integer> neighbors = new ArrayList<>();
    
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[vertex][i] != 0) {
                neighbors.add(i);
            }
        }
    
        int[] result = new int[neighbors.size()];
        for (int i = 0; i < neighbors.size(); i++) {
            result[i] = neighbors.get(i);
        }
    
        return result;
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

    
    /**
     * Metodo per esplorare con l'algoritmo BFS il grafo
     * @param vertexSource vertice sorgente da cui partire
     */
    public void bfs(int vertexSource) {
        List<Integer> queue = new ArrayList<>();
        boolean[] visited = new boolean[size];
    
        queue.add(vertexSource);
        visited[vertexSource] = true;
    
        while (!queue.isEmpty()) {
            int currentVertex = queue.remove(0);
            System.out.println(vertexData[currentVertex]);
    
            for (int neighbor : getNeighbors(currentVertex)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
    
}