package Contest_101810;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class H {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number_of_test = scanner.nextInt();
        for(int i = 1; i <= number_of_test; i++){
            int number_of_friends = scanner.nextInt();
            ArrayList<Integer> values = new ArrayList<Integer>();
            for(int j = 1; j <= 2 * number_of_friends; j++){
                values.add(scanner.nextInt());
            }
            int best = 0;
            for(int j = 1; j <= number_of_friends; j++){
                best = Math.max(best, values.get(j-1)+values.get(2 * number_of_friends - j));
            }
            System.out.println(best);
        }
    }
}