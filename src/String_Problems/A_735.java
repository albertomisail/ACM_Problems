package String_Problems;

import java.util.Scanner;

public class A_735 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String str = scanner.next();
        int g = str.indexOf('G');
        int t = str.indexOf('T');
        if(Math.abs(g-t)%k!=0){
            System.out.println("NO");
        }else{
            int min = Math.min(g,t);
            int max = Math.max(g,t);
            while(min<max-k){
                min += k;
                if(str.charAt(min)=='#'){
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }
    }
}
