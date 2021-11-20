package Back_Tracking;

import java.util.Scanner;

public class N_M_1 {

    public static int N;
    public static int M;
    public static boolean[] visit;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		N = in.nextInt();
        M = in.nextInt();

        arr = new int[M];
        visit = new boolean[N];

        dfs(N,M,0);
    }
    public static void dfs(int N, int M, int depth) {
        if(depth == M){
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        
        for(int i = 0 ; i<N;i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = i+1;
                dfs(N, M, depth+1);
                visit[i] = false;
            }
        }
    }
}
