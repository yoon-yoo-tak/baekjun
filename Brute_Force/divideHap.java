package Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class divideHap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int str_len = str.length();

        int N = Integer.parseInt(str);
        
        int result = 0;
        for(int i = (N-(str_len*9));i<N;i++){
            int num = i;
            int sum = 0;
            while(num!=0){
                sum += num%10;
                num /= 10;
            }

            if(sum + i == N){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
    
}
