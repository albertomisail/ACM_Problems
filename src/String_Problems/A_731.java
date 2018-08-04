package String_Problems;

import java.util.Scanner;

public class A_731 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder s = new StringBuilder();
        s.append('a');
        s.append(str);
        char[] arr = s.toString().toCharArray();
        int count = 0;
        for(int i = 0; i < arr.length - 1; i++){
            char prev = arr[i];
            char next = arr[i+1];
            int distance = Math.abs(next-prev);
            count += Math.min(distance, 26 - distance);
        }
        System.out.println(count);
    }
}
