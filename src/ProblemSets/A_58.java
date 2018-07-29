package ProblemSets;

import java.util.Scanner;

public class A_58 {
    public static void main(String[] args){
        String hello = "hello";
        char[] arr = hello.toCharArray();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for(Character c : arr){
            int i = str.indexOf(c);
            if(i==-1){
                System.out.println("NO");
                return;
            }else{
                str = str.substring(i+1);
            }
        }
        System.out.println("YES");
    }
}
