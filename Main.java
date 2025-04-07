public class Main {
    public static void main(String[] args) {
        UndirectedGraph undirectedGraph = new UndirectedGraph(4);

        undirectedGraph.addVertex(0, "A");
        undirectedGraph.addVertex(1, "B");
        undirectedGraph.addVertex(2, "C");
        undirectedGraph.addVertex(3, "D");

        undirectedGraph.addEdge(0, 1); // A - B
        undirectedGraph.addEdge(0, 2); // A - C
        undirectedGraph.addEdge(1, 2); // B - C
        undirectedGraph.addEdge(2, 3); // C - D

        undirectedGraph.printGraph();
    }
}
