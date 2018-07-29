package ProblemSets;

import java.util.Scanner;

public class A_41 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        StringBuilder s = new StringBuilder();
        for(int i = str2.length()-1; i >= 0; i--){
            s.append(str2.charAt(i));
        }
        if(str1.equals(s.toString())){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
