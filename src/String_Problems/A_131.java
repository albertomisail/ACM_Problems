package String_Problems;

import java.util.Scanner;

public class A_131 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String first_letter_cap = str.substring(0,1).toLowerCase()+str.substring(1).toUpperCase();
        if(str.equals(str.toUpperCase())){
            System.out.println(str.toLowerCase());
        }else if(str.equals(first_letter_cap)){
            System.out.println(str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase());
        }else{
            System.out.println(str);
        }
    }
}
