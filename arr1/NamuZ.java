package arr1;

import java.util.HashSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NamuZ {  //3052번
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> h = new HashSet<>();
        
        for(int i = 0; i<10 ; i++){
            int N = Integer.parseInt(br.readLine());
            h.add(N%42);
        }
        System.out.println(h.size());
    }
    
}
