#include<bits/stdc++.h>
using namespace std ;
int main(){
    int n ;
    cin >> n;
    int known = 0 , solve = 0 ;
    while (n--){
        int p , v, t;
        cin >> p >> v >> t ;
        if (p == 1 )
            known++;
        if (v == 1 )
            known++;
        if (t == 1 )
            known++;
        if (known >= 2) 
            solve++;
        known = 0;
    }
    cout << solve;
    return 0;
}