#include<iostream>
#include<list>
#include<iterator>
using namespace std;
void displayAdjList(list<int> adj_list[], int v) {
  for(int i = 0; i<v; i++) {
     cout << i << "--->";
     list<int> :: iterator it;
     for(it = adj_list[i].begin(); it != adj_list[i].end(); ++it) {
        cout << *it << " ";
     }
     cout << endl;
   }
}
void add_edge(list<int> adj_list[], int u, int v) {   //add v into the list u, and u into list v
   adj_list[u].push_back(v);
   adj_list[v].push_back(u);
}
main(int argc, char* argv[]) {
   int v,e;      //there are 6 vertices in the graph
   //create an array of lists whose size is 6
  cout<<"Enter the number of vertices:";
cout<<"\nEnter the number of edges:";
  cin>>v>>e; 
  
  list<int> adj_list[v];

 

  int arr[10], arr1[10];

   for(int i=1;i<=e;i++)
  {
    cout<<"\nEnter the Start node and End node of edge "<<i;
    cin>>arr[i];
    cin>>arr1[i];
   add_edge(adj_list, arr[i], arr1[i]);
   }
  cout<<"\nAdjacency List:";
 
  cout<<endl;
   displayAdjList(adj_list, v);
  
}