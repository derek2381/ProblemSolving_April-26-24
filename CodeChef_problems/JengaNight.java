// problem link
// https://www.codechef.com/problems/JENGA

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt(), x = sc.nextInt();

		    if(x % n == 0){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}

	}
}
