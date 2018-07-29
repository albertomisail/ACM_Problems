package Contest_101555;

import java.util.Scanner;

public class C {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i = 0;  i < n; i++){
            String str = scanner.next();
            if(!str.contains("CD")) count++;
        }
        System.out.println(count);
    }
}
