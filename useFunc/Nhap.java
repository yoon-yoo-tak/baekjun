package useFunc;

public class Nhap {
    long sum(int[] a) { //15596번
		long sum = 0;	// a 배열 정수 합 변수
        
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
