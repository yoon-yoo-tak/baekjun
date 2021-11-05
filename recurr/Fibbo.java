package recurr;

import java.util.Scanner;

public class Fibbo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(fibbo_func(n));
        
    }
    public static int fibbo_func(int n){
        if(n == 0){
            return 0;
        }if(n<=2){
            return 1;
        }
        return fibbo_func(n-1) + fibbo_func(n-2);
    }
    
}
