package stringg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ascii { // 11654번
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       char c = br.readLine().charAt(0);
       
       System.out.println((int)c);
        
    }
}
