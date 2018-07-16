package Contest_101810;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class I {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number_of_test = scanner.nextInt();
        for(int test = 1; test <= number_of_test; test++){
            int x = scanner.nextInt();
            int n = scanner.nextInt();
            int f = x / n;
            if(f == 0){
                System.out.print(-1+" ");
            }
            else {
                int b = x - f*n;
                for(int i = 0; i < n-b; i++){
                    System.out.print(f+" ");
                }
                for(int i = 0; i < b; i++){
                    System.out.print(f+1+" ");
                }
            }
            System.out.print("\n");
        }
    }
}
