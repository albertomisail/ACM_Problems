package Contest_100812;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_bandits = scanner.nextInt();
        ArrayList<Integer> minimal_number = new ArrayList<>(number_of_bandits);
        for (int i = 0; i < number_of_bandits; i++) {
            minimal_number.add(scanner.nextInt());
        }
        Collections.sort(minimal_number);
        for(int i = number_of_bandits - 1; i > -1; i--){
            if(minimal_number.get(i) > i){
                minimal_number.remove(i);
            }
            else{
                break;
            }
        }
        System.out.println(minimal_number.size());
    }
}
