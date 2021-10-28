package arr1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Max { // 2562번
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int max = 0;
        int idx = 0;
        int row = 0;
        
        int arr[] = new int[9];

        for(int i = 0;i<9;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }


        for(int val : arr){
            row++;
            if(val>max){
                max = val;
                idx = row;
            }
        }
        System.out.println(max + "\n" + idx);
    }
}
