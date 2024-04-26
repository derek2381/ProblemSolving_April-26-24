// problem link
// https://www.codechef.com/problems/TRANCHAIN?tab=statement

#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin >> t;
	while(t--){
	    int n;
	    cin >> n;
	    int co = 0, ca = 0, cb = 0, cab = 0;
	    string str;


	    for(int i = 0;i < n;i++){
	        cin >> str;
	        if(str == "O"){
	            co++;
	        }else if(str == "AB"){
	            cab++;
	        }else if(str == "A"){
	            ca++;
	        }else if(str == "B"){
	            cb++;
	        }
	    }

	    if(ca > cb){
	        co += ca + cab;
	    }else{
	        co += cb + cab;
	    }

	    cout << co << endl;




	}

}
