package forMoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class smallthanX { // 10871번
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		StringBuilder sbd = new StringBuilder();
		
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<A;i++) {
            int C = Integer.parseInt(st.nextToken());
			
			if(C < B) {
                sbd.append(C).append(' ');
			}
		}
		System.out.println(sbd);
        
	}
}

