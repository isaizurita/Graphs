import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class GraficaListaA 
    {
        private int vertices;
        private List<List<Integer>> adjacencyList;
    
        public GraficaListaA(int vertices) 
            {
            this.vertices = vertices;
            this.adjacencyList = new ArrayList<>(vertices);
            for (int i = 0; i < vertices; i++) 
                {
                    adjacencyList.add(new ArrayList<>());
                }
            }
    
        public void addEdge(int source, int destination) 
            {
                adjacencyList.get(source).add(destination);
                adjacencyList.get(destination).add(source);
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
                
                        for (int neighbor : adjacencyList.get(currentVertex)) 
                            {
                            if (!visited[neighbor]) 
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
                
                    for (int neighbor : adjacencyList.get(currentVertex)) 
                        {
                            if (!visited[neighbor]) 
                                {
                                visited[neighbor] = true;
                                stack.push(neighbor);
                                }
                        }
                    }
            }
    }
