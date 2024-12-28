#include <bits/stdc++.h>

using namespace std;

// topological sort 
vector<vector<int>> graph;
vector<int> result;
int visited[100100] ={0};

void topologicalSort(int parent){
    visited[parent] = 1;
    int sz = graph[parent].size();
    for(int i = 0; i < sz; i++){
        int child = graph[parent][i];
        if(visited[child] == 0){
            topologicalSort(child);
        }
    }
    result.push_back(parent);
}

int main(){
    int n, k;
    cin >> n >> k;
    
    
    graph.resize(n+1);
    // creating the graph
    // O(k*w)
    for(int i = 1; i <= k; i++){
        int w;
        cin >> w;
        for (int j = 1; j <= w; j++){
            int child;
            cin >> child;
            graph[i].push_back(child);
        }
    }
    // O(n+e)
    for(int i = 1; i <= n; i++){
        if(visited[i] == 0){
            topologicalSort(i);
        }
    }
    int parent[n+1];
    int cur_parent = 0;
    for (int i = n-1; i >= 0; i-- ){
        parent[result[i]] = cur_parent;
        cur_parent = result[i];
    }
    for(int i = 1; i <= n; i++){
        cout << parent[i] << endl;
    }
    return 0;
}
