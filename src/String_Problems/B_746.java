package String_Problems;

import java.util.Scanner;

public class B_746 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        StringBuilder s = new StringBuilder(str.charAt(0)+"");
        for(int i = 1; i < str.length(); i++){
            int l = str.length() - i;
            if(l%2==0){
                s.reverse();
                s.append(str.charAt(i));
                s.reverse();
            }else{
                s.append(str.charAt(i));
            }
        }
        System.out.println(s.toString());
    }
}
