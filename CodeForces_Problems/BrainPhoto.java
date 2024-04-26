// problem link
// https://codeforces.com/problemset/problem/707/A

import java.util.*;

public class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        boolean fc = false, fbw = false;
        sc.nextLine();

        char[][] arr = new char[n][m];

        // i learnt how to take a character array input.

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                arr[i][j] = sc.next().charAt(0);
                if(arr[i][j] == 'W' || arr[i][j] == 'B' || arr[i][j] == 'G'){
                    fbw = true;
                }else{
                    fc = true;
                }
            }
        }

        if(fbw == true && fc == true){
            System.out.println("#Color");
        }else if(fc == true)
        {
            System.out.println("#Color");
        }else if(fbw == true){
            System.out.println("#Black&White");
        }
    }
}
