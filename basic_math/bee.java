package basic_math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class bee { // 2292번
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		int A = 1; 
		int B = 2;	
 
		if (N == 1) {
			System.out.print(1);
		}
 
		else {
			while (A <= N) {	 
				A = A + (6 * B);
				B++;
			}
			System.out.print(B);
		}
	}
}