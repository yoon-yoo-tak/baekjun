package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class sortInside {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String n = br.readLine();
        Integer[] arr = new Integer[n.length()];
        for(int i = 0; i<n.length();i++ ){
            arr[i] = (int)(n.charAt(i))-48;
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i: arr){
            System.out.print(i);
        }
    }

    
    
}
