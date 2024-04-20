public class Main {
    public static void main(String[] args) 
        {
            // Crear una gráfica mediante lista de adyacencia
            GraficaListaA graf1 = new GraficaListaA(8);
        
            // Gráfica 1
            graf1.addEdge(0, 1);
            graf1.addEdge(0, 5);
            graf1.addEdge(1, 5);
            graf1.addEdge(2, 0);
            graf1.addEdge(2, 3);
            graf1.addEdge(2, 4);
            graf1.addEdge(3, 4);
            graf1.addEdge(3, 7);
            graf1.addEdge(4, 6);
            graf1.addEdge(5, 2);
            graf1.addEdge(5, 4);
            graf1.addEdge(6, 3);
            graf1.addEdge(6, 7);

            // Ejecutar BFS desde el vértice 0
            System.out.println("BFS:");
            graf1.BFS(0);
        
            // Ejecutar DFS desde el vértice 0
            System.out.println("\nDFS:");
            graf1.DFS(0);
        }
  }