public class Main {
    public static void main(String[] args) {
        UndirectedGraph undirectedGraph = new UndirectedGraph(4);

        undirectedGraph.addVertex(0, "A");
        undirectedGraph.addVertex(1, "B");
        undirectedGraph.addVertex(2, "C");
        undirectedGraph.addVertex(3, "D");

        undirectedGraph.addEdge(0, 1);
        undirectedGraph.addEdge(0, 2);
        undirectedGraph.addEdge(0, 3);
        undirectedGraph.addEdge(1, 2);

        undirectedGraph.printGraph();
    }
}
