package src;

public class UndirectedGraph extends Graph {
    public UndirectedGraph(int size) {
        super(size);
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
    @Override
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
    @Override
    public void removeEdge(int from, int to) {
        if(isValidVertex(from) && isValidVertex(to) && isValidEdge(from, to)) {
            adjacencyMatrix[from][to] = 0;
            adjacencyMatrix[to][from] = 0;
        }
    }
}