package Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class black_jack {

    public static int card_func(int[] arr,int N,int M){
        int result = 0;
        for(int i = 0 ; i <N-2; i++){
            for(int j = i+1; j<N-1; j++){
                for(int k = j+1; k<N;k++){
                    int temp = arr[i] + arr[j] + arr[k];

                    if( M == temp){
                        return temp;
                    }
                    if (result<temp && temp<M){
                        result = temp;
                    }
                }
            }
        }

        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int card[] = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            card[i] = Integer.parseInt(st.nextToken());
        }
        int result = card_func(card, N, M);
        System.out.println(result);
        
    }
    
}
