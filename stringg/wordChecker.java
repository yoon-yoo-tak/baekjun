package stringg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class wordChecker { //1316번
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int count = a;
        for(int i = 0; i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for(int j = 1 ; j < s.length(); j++){
                if(s.indexOf(s.charAt(j-1))>s.indexOf(s.charAt(j))){
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
    
}
