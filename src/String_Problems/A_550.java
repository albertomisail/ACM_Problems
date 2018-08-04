package String_Problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_550 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.next().toCharArray();
        Set<Integer> indexes_ab = new HashSet<>();
        Set<Integer> indexes_ba = new HashSet<>();
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i]=='A'&&arr[i+1]=='B'){
                indexes_ab.add(i);
            }
            if(arr[i]=='B'&&arr[i+1]=='A'){
                indexes_ba.add(i);
            }
        }
        for(Integer i : indexes_ab) {
            Set<Integer> potential = new HashSet<>(indexes_ba);
            potential.remove(i+1);
            potential.remove(i-1);
            if(potential.size()>0){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
