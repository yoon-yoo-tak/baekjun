package stringg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class repeat { // 2675번

   public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for (int i=0 ; i<T;i++){
            st = new StringTokenizer(br.readLine()," ");
            int R = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for(int j=0 ; j<s.length(); j++){
                for(int k=0;k<R;k++){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
        
    } 
}
