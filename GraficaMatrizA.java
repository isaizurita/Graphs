import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class GraficaMatrizA 
    {
        private int vertices;
        private int[][] adjacencyMatrix;
    
        public GraficaMatrizA(int vertices) 
            {
                this.vertices = vertices;
                this.adjacencyMatrix = new int[vertices][vertices];
            }
    
        public void addEdge(int source, int destination) 
            {
                adjacencyMatrix[source][destination] = 1;
                adjacencyMatrix[destination][source] = 1; 
            }
    
        public void BFS(int startVertex) 
        {
            boolean[] visited = new boolean[vertices];
            Queue<Integer> queue = new LinkedList<>();
        
            visited[startVertex] = true;
            queue.add(startVertex);
        
            while (!queue.isEmpty()) 
                {
                    int currentVertex = queue.poll();
                    System.out.print(currentVertex + " ");
            
                    for (int neighbor = 0; neighbor < vertices; neighbor++) 
                        {
                            if (adjacencyMatrix[currentVertex][neighbor] == 1 && !visited[neighbor]) 
                                {
                                    visited[neighbor] = true;
                                    queue.add(neighbor);
                                }
                        }
                }
        }

        public void DFS(int startVertex) 
            {
                boolean[] visited = new boolean[vertices];
                Stack<Integer> stack = new Stack<>();
            
                visited[startVertex] = true;
                stack.push(startVertex);
            
                while (!stack.isEmpty()) 
                    {
                        int currentVertex = stack.pop();
                        System.out.print(currentVertex + " ");
                    
                        for (int neighbor = vertices - 1; neighbor >= 0; neighbor--)
                            { 
                                if (adjacencyMatrix[currentVertex][neighbor] == 1 && !visited[neighbor]) 
                                    {
                                        visited[neighbor] = true;
                                        stack.push(neighbor);
                                    }
                            }
                    }
            }
    }
  