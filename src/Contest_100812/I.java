package Contest_100812;

import java.util.ArrayList;
import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_deliveries = scanner.nextInt();
        int delivery_cost = scanner.nextInt();
        int delay_cost = scanner.nextInt();
        ArrayList<Integer> times = new ArrayList<>();
        for (int i = 0; i < number_of_deliveries; i++) {
            times.add(scanner.nextInt());
        }
        int total_cost = 0;
        for(int i = 0; i < number_of_deliveries - 1; i++){
            int cost_separately = 2 * delivery_cost;
            int cost_together = delivery_cost + delay_cost * (times.get(i+1) - times.get(i));
            if(cost_separately <= cost_together){
                total_cost += cost_separately;
            }else{

            }
        }
    }
}
