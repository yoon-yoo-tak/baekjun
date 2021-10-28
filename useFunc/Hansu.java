package useFunc;

import java.util.Scanner;

public class Hansu { // 1065번
        
        public static void main(String[] args) {
            Hansu h = new Hansu();
            Scanner in =  new Scanner(System.in);
            System.out.println(h.Hnum(in.nextInt()));
            in.close();
            
            
        }
        public int Hnum (int n){
            int h = 0; // 카운트 해 줄 변수
            if(n<100){
                return n;
            }else{
                h = 99; // 100 이상이면 한수의 최소갯수는 99개이므로
                for(int i = 100 ; i<=n;i++){ //100 이상이므로 100부터 N까지
                    int a = i/100; // 100의자리
                    int b = (i/10)%10; // 10의자리
                    int c = i%10;  // 1의자리
    
                    if((a-b)==(b-c)){ 
                        h++;
                    }
              }
            }
            return h;
        }
}

