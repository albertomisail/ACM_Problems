package String_Problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_520 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        char[] str = scanner.next().toLowerCase().toCharArray();
        Set<Character> chars = new HashSet<>();
        for(Character c : str){
            chars.add(c);
        }
        if(chars.size() < 26){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
