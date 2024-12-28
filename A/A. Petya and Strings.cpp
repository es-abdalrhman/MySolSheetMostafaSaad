#include <bits/stdc++.h>
using namespace std ;
void strTolow(string &s){
    int size =  s.length(); 
    for (int i = 0 ; i < size ; i++){
        s[i] = tolower (s[i]);
    }
}
int main (){
    string s1 , s2 ;
    cin >> s1 >> s2 ;
    strTolow(s1);
    strTolow(s2);
    
    cout << s1.compare(s2);
    

    

    return 0 ;
}