package ProblemSets;

import java.util.Scanner;

public class A_339 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int[] arr = new int[3];
        for(int i = 0; i < str.length(); i+=2){
            arr[Character.getNumericValue(str.charAt(i))-1]++;
        }
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < arr[i]; j++){
                s.append(i+1);
                s.append('+');
            }
        }
        s.deleteCharAt(s.length()-1);
        System.out.println(s.toString());
    }
}
