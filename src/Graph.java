package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Graph {
    protected int[][] adjacencyMatrix;
    protected String[] vertexData;
    protected int size;

    public Graph(int size) {
        this.size = size;
        this.adjacencyMatrix = new int[size][size];
        this.vertexData = new String[size];
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
    protected boolean isValidVertex(int vertex) {
        return vertex >= 0 && vertex < this.size;
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
     * Metodo per aggiungere un arco al grafo
     * @param from vertice di partenza
     * @param to vertice di arrivo
     */
    public abstract void addEdge(int from, int to, int weight);

    /**
     * Metodo per rimuovere un arco dal grafo
     * @param from vertice di partenza
     * @param to vertice di arrivo
     */
    public abstract void removeEdge(int from, int to);
}
