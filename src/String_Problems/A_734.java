package String_Problems;

import java.util.Scanner;

public class A_734 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] text = scanner.next().toCharArray();
        int a = 0;
        int d = 0;
        for(Character c : text){
            if(c=='A'){
                a++;
            }else{
                d++;
            }
        }
        if(a>d){
            System.out.println("Anton");
        }else if(a==d){
            System.out.println("Friendship");
        }else{
            System.out.println("Danik");
        }
    }
}
