/*
	SPOJ AGGRCOW
	Author: Youssef ElGhareeb
*/

#include <iostream>
#include <stdio.h>
#include <cmath>
#include <map>
#include <vector>
#include <functional>
#include <assert.h>
#include <string>
#include <algorithm>

using namespace std;

#define ll long long
#define vi vector<int>
#define pb push_back
#define loop(i,n) for(int i=0; i<n; i++)
#define pii pair<int, int>

const int MXN = 1e5 + 5;
int n, k;
int a[MXN];

bool can(int distance) {
	int current_val = a[0], ptr = 1, cntr = 1;
	for (int i = 1; i < n; i++) {
		if (a[i] - current_val >= distance) {
			cntr++;
			current_val = a[i];
		}
	}
	if (cntr >= k) return true;
	return false;
}

int main () {
	ios_base::sync_with_stdio(false);
	int num_tests;
	cin>>num_tests;
	for (int test=0; test<num_tests; test++) {
		/* Read the input */
		cin>>n>>k;
		for (int i=0; i<n; i++) cin>>a[i];
		
		/* Sort the array */
		sort(a, a+n); // need to be sorted to put the cows in the line

		/* Binary search */ // on the distance 
		int hi = 1e9 + 7, lo = 0, mid;
		while (lo < hi - 1) {
			mid = (lo + hi) / 2;
			if (can(mid)) lo = mid; // if can but the cows using this distance assign it to lo
			else hi = mid - 1;      // if can't decrease the distance to mid -1
		}
        // if found this distance or the result will result in 
		if (can(hi)) cout<<hi<<endl;
		else cout<<lo<<endl;
	}
	return 0;
}