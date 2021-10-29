package stringg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hap { //11720번
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        String b = br.readLine();
        int sum = 0;
        for(int i = 0; i<a;i++){
            sum += b.charAt(i)-'0';
        }

        System.out.println(sum);
        
        
    }
}
