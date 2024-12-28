#include <bits/stdc++.h>
using namespace std;
int main(){
    int n , a ,d ;
    string s ;
    cin >> n >> s ;
    for (int i =0 ;i < n ;i++){
        if (s[i]=='A'){
            a += 1;
        }else{
            d += 1;
        }
    }
    if (a > d){
        cout << "Anton"<<endl ;

    }else if (a < d){
        cout << "Danik"<<endl;
    }else{
        cout << "Friendship"<< endl;
    }
    return 0;
}