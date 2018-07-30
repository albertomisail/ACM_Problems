package String_Problems;

import java.util.Scanner;

public class A_59 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] arr1 = str.toCharArray();
        char[] arr2 = str.toLowerCase().toCharArray();
        int a = 0;
        for(int i = 0; i < str.length(); i++){
            if(arr1[i]==arr2[i]){
                a++;
            }
        }
        if(a >= (float)str.length()/2){
            System.out.println(str.toLowerCase());
        }else{
            System.out.println(str.toUpperCase());
        }
    }
}
