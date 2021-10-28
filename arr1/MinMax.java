package arr1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class MinMax {  // 10818번
        public static void main(String[] args) throws IOException{
        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int index = 0;
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        while(st.hasMoreTokens()){
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N-1]);
        
    }
}
