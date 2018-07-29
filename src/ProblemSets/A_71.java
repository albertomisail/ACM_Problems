package ProblemSets;

import java.util.Scanner;

public class A_71 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            String str = scanner.next();
            int l = str.length();
            if(l>10){
                StringBuilder s = new StringBuilder();
                s.append(str.charAt(0));
                s.append(l-2);
                s.append(str.charAt(l-1));
                System.out.println(s.toString());
            }else{
                System.out.println(str);
            }
        }
    }
}
