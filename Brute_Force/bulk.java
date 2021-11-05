package Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bulk { // 7568번
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> weight_list = new ArrayList<>();
        ArrayList<Integer> height_list = new ArrayList<>();
        for (int i = 0 ; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            weight_list.add(weight);
            height_list.add(height);   
            
        }
        for(int i = 0 ; i<weight_list.size(); i++){
            int rank = 1;
            for(int j  = 0; j<weight_list.size();j++){
                if(i == j) continue;

                if(weight_list.get(i)<weight_list.get(j) && height_list.get(i)<height_list.get(j) ){
                    rank++;
                }
            }
            System.out.println(rank);
        }
        
        
    }
}

