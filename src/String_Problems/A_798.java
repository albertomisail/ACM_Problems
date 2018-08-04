//package String_Problems;

import java.util.Scanner;

public class A_798 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if(check_palindrome(str)){
            System.out.println("YES");
            return;
        }
        for(int i = 0; i < str.length()/2; i++){
            char c = str.charAt(str.length()-i-1);
            if(c!=str.charAt(i)) {
                StringBuilder s = new StringBuilder(str);
                s.replace(i, i + 1, c + "");
                if (check_palindrome(s.toString())) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }

    public static boolean check_palindrome(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
