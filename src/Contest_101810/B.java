package Contest_101810;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number_of_test = scanner.nextLong();
        for (long test = 1; test <= number_of_test; test++) {
            long x = scanner.nextLong();
            long n = scanner.nextInt();
            if(n == 1){
                System.out.println(x+" ");
            }
            else {
                if (x <= n) {
                    for (long i = 0; i < x; i++) {
                        System.out.print(1 + " ");
                    }
                    for (long i = 0; i < n - x; i++) {
                        System.out.print(0 + " ");
                    }
                } else {
                    x -= n;
                    long rounds = x / (n - 1);
                    long reminder = x % (n - 1);
                    long middle_value = 1 + rounds;
                    long first_value, last_value;
                    if (rounds % 2 == 0) {
                        first_value = 1 + rounds / 2;
                        last_value = first_value;
                        System.out.print(first_value + " ");
                        if (reminder == 0) {
                            for (long i = 0; i < n - 2; i++) {
                                System.out.print(middle_value + " ");
                            }
                        } else {
                            for (long i = 0; i < n - reminder - 2; i++) {
                                System.out.print(middle_value + " ");
                            }
                            for (long i = 0; i < reminder; i++) {
                                System.out.print(middle_value + 1 + " ");
                            }
                        }
                        System.out.print(last_value + " ");
                    } else {
                        first_value = 1 + 1 + rounds / 2;
                        last_value = 1 + rounds / 2;
                        System.out.print(first_value + " ");
                        if (reminder == 0) {
                            for (long i = 0; i < n - 2; i++) {
                                System.out.print(middle_value + " ");
                            }
                        } else {
                            for (long i = 0; i < reminder; i++) {
                                System.out.print(middle_value + 1 + " ");
                            }
                            for (long i = 0; i < n - reminder - 2; i++) {
                                System.out.print(middle_value + " ");
                            }
                        }
                        System.out.print(last_value + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}