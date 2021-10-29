package stringg;

import java.util.Scanner;

public class Dial { //5622번
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       String a = in.next();
       int count = 0;
       in.close();
       for(int i=0;i<a.length();i++){
           char s = a.charAt(i);
           if('A'<=s && s<='C'){
            count += 3;
           }else if('D'<=s && s<='F'){
            count+=4;
           }else if('G'<=s && s<='I'){
            count+=5;
           }else if('J'<=s && s<='L'){
            count+=6;
           }else if('M'<=s && s<='O'){
            count+=7;
           }else if('P'<=s && s<='S'){
            count+=8;
           }else if('T'<=s && s<='V'){
            count+=9;
           }else if('W'<=s && s<='Z'){
            count+=10;
           }
       }
       System.out.println(count);
    }
}
