package Back_Tracking;

import java.util.Scanner;

public class N_M_2 {
    public static int N;
    public static int M;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		N = in.nextInt();
        M = in.nextInt();

        arr = new int[M];

        dfs(1,0);
    }

    public static void dfs(int at, int depth) {
        if(depth == M){
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        
        for(int i = at ; i<=N;i++){
            arr[depth] = i;
            dfs(i + 1,depth+1);
        }
    }
}
