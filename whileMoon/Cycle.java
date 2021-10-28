package whileMoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Cycle {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int count = 0;
        int b = a;

        while(true){
            a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
            count++;

            if(b == a){
                break;
            }
        }
        System.out.println(count);
    }
}
