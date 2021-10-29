package stringg;

import java.util.Scanner;

public class alpha { // 10809번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word = sc.next();
        sc.close();
        for (char c = 'a' ; c <= 'z' ; c++){
            System.out.print(word.indexOf(c) + " ");
        }
    }
}
