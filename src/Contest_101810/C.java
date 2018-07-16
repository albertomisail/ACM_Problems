package Contest_101810;

import java.util.Scanner;

public class C {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number_of_tests = scanner.nextInt();
        for(int test = 1; test <= number_of_tests; test++){
            int n = scanner.nextInt();
            int xor = n ^ (n-1);
            int count=0;
            while (xor!=0){
                xor &= (xor-1);
                count++;
            }
            System.out.println(count);
        }
    }
}