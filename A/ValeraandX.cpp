#include <bits/stdc++.h>
using namespace std;

int main(){
    int n ;
    cin >> n;
    string s[n];
    // char x = s[0][0];
    vector<char> ch ;
    for(int i = 0 ; i <n ; i++){
        cin >> s[i];
        for(int j = 0 ; j < n ;j++){
            bool found = false;
            int sz = ch.size();
            for(int c = 0 ; c < sz ;c++){
                if(s[i][j] == ch[c]){
                    found = true;
                    break;
                }
            }
            if(!found){
                ch.push_back(s[i][j]);
            }
        }
    }
    if(ch.size() > 2 ){
        cout << "NO";
        return 0;
    }
    for(int i = 0 ; i < n; i++){
        for(int j = 0 ; j < n ; j++){
            if (i == j || i+j == n-1){
                if(s[i][j] != ch[0]){
                    cout << "NO";
                    return 0;
                }
            }else{
                if(s[i][j] != ch[1]){
                    cout << "NO";
                    return 0;
                }
            }
        }
    }

    cout << "YES";




    return 0;
}