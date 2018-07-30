package String_Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_118 {
    public static void main(String[] args){
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','y'));
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        str = str.toLowerCase();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(!vowels.contains(c)){
                s.append('.');
                s.append(c);
            }
        }
        System.out.println(s.toString());
    }
}
