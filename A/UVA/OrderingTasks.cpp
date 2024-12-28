#include <bits/stdc++.h>
using namespace std;
vector<int> result;
vector<vector<int>> graph;
bool visited[110] ;

void toposort(int parent){
    visited[parent] =true;
    int sz = graph[parent].size();
    for(int i = 0;i < sz;i++){
        int child = graph[parent][i];
        if (!visited[child]){
            toposort(child);
        }
    }
    result.push_back(parent);
}

int main(){
    int n,m;
    cin >> n >> m ;
    graph.resize(n+1);
    for(int i = 0 ; i < m+1 ;i++){
        int s,e;
        cin >> s >> e;
        if (s == 0) break;
        graph[s].push_back(e);
    }
    memset(visited , false, sizeof visited);
    for (int i = 1 ; i <= n; i++){
        if(!visited[i]){
            toposort(i);
        }
    }
    for(int i = n-1;i >= 0 ; i--){
        cout << result[i] ;
        if (i != 0){
            cout << " ";
        }
    }

    return 0;
}