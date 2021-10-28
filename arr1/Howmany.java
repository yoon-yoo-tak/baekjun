package arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Howmany { // 2577번
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[10];

        int N = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());

        String str  = String.valueOf(N);

        for(int i=0;i<str.length();i++){
            arr[(str.charAt(i))-'0']++;
        }

        for(int value : arr){
            System.out.println(value);
        }
    }    
}
