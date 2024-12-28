#include<bits/stdc++.h>
using namespace std;
int main(){
    int mat[5][5];
    int moves ;
    for (int i = 0 ;i < 5 ;i++){
        for(int j = 0 ;j < 5 ;j++){
            cin >> mat[i][j];
            if (mat[i][j]){
                moves = abs(i-2)+abs(j-2);
            }
        }
    }
    cout << moves ;
    return 0;
}