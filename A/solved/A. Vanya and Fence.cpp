#include<bits/stdc++.h>
using namespace std;
int main (){
    int n , maxh ;
    cin >> n >> maxh;
    int  curh;
    int width = 0 ;
    for (int i = 0 ;i < n ;i++){
        cin >>curh;
        if (curh > maxh){
            width += 2;
        }else{
            width += 1;
        }
    }
    cout << width ;
    
    return 0;
}