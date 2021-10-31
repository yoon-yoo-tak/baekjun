package basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class apart {  // 2775번
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int apt[][] = new int[15][15];
        
        for(int i = 0; i<15; i++){
            apt[i][1]= 1;
            apt[0][i] =i;
        }

        for(int i = 1 ; i<15;i++){ // 층
            for(int j = 2; j<15;j++){ // 호
                apt[i][j] = apt[i][j-1] + apt[i-1][j];
            }    
        }

        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(apt[k][n]);
        }
    }   
}
