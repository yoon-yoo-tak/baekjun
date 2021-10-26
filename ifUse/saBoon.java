package ifUse;

import java.util.Scanner;

public class saBoon { // 14681번
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		String x = in.next();
		String y = in.next();
		in.close();
		
		if(x.charAt(0)=='-') {
			if(y.charAt(0)=='-') {
				System.out.println("3");
			}else {
				System.out.println("2");
			}
		
		}else if(y.charAt(0)=='-') {
			System.out.println("4");
		}else {
			System.out.println("1");
		}
    }
}
