package recurr;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(fact_func(n));
    }
    public static int fact_func(int N){
        
        if(N<=1){
            return 1;
        }
        return N * fact_func(N-1);
    }
    
}
