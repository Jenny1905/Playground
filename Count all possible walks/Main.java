#include <stdio.h> 
int countwalks(int V, int graph[][V], int u, int v, int k) 
{ 
   
   if (k == 0 && u == v)      return 1; 
   if (k == 1 && graph[u][v]) return 1; 
   if (k <= 0)                return 0; 
   int count = 0; 
   for (int i = 0; i < V; i++) 
       if (graph[u][i] == 1) 
           count += countwalks(V, graph, i, v, k-1); 
   return count; 
} 
int main() 
{ 
     int V;
     scanf("%d", &V);
     int graph[V][V];
     for(int i = 0; i < V; i++){
         for(int j = 0; j < V; j++){
             scanf("%d", &graph[i][j]);
         }
     }
     int u, v, k;
     scanf("%d%d%d", &u, &v, &k);
    printf("%d", countwalks(V, graph, u, v, k)); 
    return 0; 
}