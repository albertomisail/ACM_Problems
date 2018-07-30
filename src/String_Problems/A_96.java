package String_Problems;

import java.util.Scanner;

public class A_96 {
    public static void main(String[] args){
        String one = "1111111";
        String zero = "0000000";
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if(str.contains(one)||str.contains(zero)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}