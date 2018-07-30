package String_Problems;

import java.util.Scanner;

public class A_112 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next().toLowerCase();
        String str2 = scanner.next().toLowerCase();
        int r = str1.compareTo(str2);
        if(r!=0) {
            System.out.println(r / Math.abs(r));
        }else{
            System.out.println(0);
        }
    }
}
