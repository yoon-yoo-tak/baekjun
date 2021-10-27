package forMoon;

import java.util.Scanner;

public class AplusB3 { // 10950번
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int arr[] = new int[a];
		for(int i = 0 ; i<a ; i++) {
			int b = in.nextInt();
			int c = in.nextInt();
			arr[i] = b+c;
		}
		in.close();
		for(int k : arr) {
			System.out.println(k);
		}

	}
}
