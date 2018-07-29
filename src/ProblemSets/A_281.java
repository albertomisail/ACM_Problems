package ProblemSets;

import java.util.Scanner;

public class A_281 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder s = new StringBuilder(str);
        s.replace(0,1,str.substring(0,1).toUpperCase());
        System.out.println(s.toString());
    }
}
