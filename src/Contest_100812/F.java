package Contest_100812;

import java.util.ArrayList;
import java.util.Scanner;

public class F {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<ArrayList<Character>> graveyard = new ArrayList<>(n);
        ArrayList<ArrayList<Character>> graveyardTranspose = new ArrayList<>(m);
        int max = Math.max(n, m);
        int[] counts = new int[max+1];
        for(int i = 0; i < m; i++){
            graveyardTranspose.add(new ArrayList<>(n));
        }
        for(int i = 0; i < n; i++){
            String value = scanner.next();
            ArrayList<Character> row = new ArrayList<>(m);
            int count = 0;
            for(int j = 0; j < m; j++){
                char c = value.charAt(j);
                row.add(c);
                graveyardTranspose.get(j).add(i, c);
                if(c == '+'){
                    for(int k = 1; k <= count; k++){
                        counts[k] += count + 1 - k;
                    }
                    count = 0;
                }else{
                    count++;
                }
            }
            for(int k = 1; k <= count; k++){
                counts[k] += count + 1 - k;
            }
            graveyard.add(row);
        }
        for(int i = 0; i < m; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                char c = graveyardTranspose.get(i).get(j);
                if(c == '+'){
                    for(int k = 2; k <= count; k++){
                        counts[k] += count + 1 - k;
                    }
                    count = 0;
                }else{
                    count++;
                }
            }
            for(int k = 2; k <= count; k++){
                counts[k] += count + 1 - k;
            }
        }
//        System.out.println(graveyard);
//        System.out.println(graveyardTranspose);
        for(int i = 1; i <= max; i++){
            System.out.print(counts[i]+" ");
        }
    }
}
