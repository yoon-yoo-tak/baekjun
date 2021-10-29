package stringg;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class croa { // 2941번
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String a = br.readLine();

        for(int i = 0 ; i<s.length;i++){
            if(a.contains(s[i])){
                a = a.replace(s[i], " ");
            }
        }
        System.out.println(a.length());
    }
    
}
