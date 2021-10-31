package basic_math_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class find_prime { // 1978번
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        br.readLine();
        int count = 0;
        st = new StringTokenizer(br.readLine(), " ");

        while(st.hasMoreTokens()){
            boolean prime_num = true;

            int num = Integer.parseInt(st.nextToken());
            if(num == 1){
                continue;
            }
            for (int i = 2;i<=Math.sqrt(num);i++){
                if(num % i == 0){
                    prime_num = false;
                    break;
                }
            }
            if(prime_num){
                count++;
            }
        }
        System.out.println(count);

    }
    
}
