package useFunc;

public class selfNum { //4673번
    public static void main(String[] args) {
		boolean[] not = new boolean[10001];
		
		for (int i = 1; i <= 10000; ++i) {
			int dn = getD(i);
			if (dn <= 10000) {
				not[dn] = true;				
			}
		}
		
		for (int i = 1; i < not.length; ++i) {
			if (!not[i]) {
				System.out.println(i);				
			}
		}
	}
	
	private static int getD(int n) {
		int d = n;
		while(n > 0) {
			d += n % 10;
			n /= 10;
		}
		return d;
	}
}
