//package Contest_100812;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number_of_cards = scanner.nextInt();
        ArrayList<Integer> costs = new ArrayList<>(number_of_cards);
        ArrayList<Integer> resources = new ArrayList<>(number_of_cards);
        for(int i = 0; i < number_of_cards; i++){
            costs.add(scanner.nextInt());
            resources.add(scanner.nextInt());
        }
        int nextCard = number_of_cards - 1;
        ArrayList<Integer> cards = new ArrayList<>();
        cards.add(nextCard+1);
        if(number_of_cards == 1){
            if(costs.get(0) > 1){
                System.out.println("No such luck");
                return;
            }else{
                System.out.println(1);
                System.out.println(1);
                return;
            }
        }
        while(true){
            nextCard = getNextCard(costs, resources, nextCard);
            if(nextCard == -1){
                System.out.println("No such luck");
                return;
            }else if(costs.get(nextCard)<=1){
                cards.add(nextCard+1);
                Collections.sort(cards);
                System.out.println(cards.size());
                for(Integer i : cards){
                    System.out.print(i+" ");
                }
                return;
            }else{
                cards.add(nextCard+1);
            }
        }
    }

    public static int getNextCard(ArrayList<Integer> costs, ArrayList<Integer> resources, int index){
        int result = -1;
        int cost = costs.get(index);
        for(int i = index - 1; i >= 0; i--){
            if(resources.get(i) >= cost){
                if(result == -1){
                    result = i;
                }else if(costs.get(i) < costs.get(result)){
                    result = i;
                }
            }
        }
        return  result;
    }
}
