#include<bits/stdc++.h>
using namespace std;
int main (){
    int x,y ;
    cin  >> x >> y;
    int count = 0  ;
    while (true){
        count ++ ;
        x = x*3;
        y = y*2;
        if (x > y ){
            break;
        }
    }
    cout << count;
    return 0 ;
}