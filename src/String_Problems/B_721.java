package String_Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_721 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        HashMap<Integer, Integer> length_freq = new HashMap<>();
        for(int i = 0;  i < n; i++){
            int l = scanner.next().length();
            if(length_freq.containsKey(l)){
                length_freq.put(l, length_freq.get(l)+1);
            }else{
                length_freq.put(l,1);
            }
        }
        int l = scanner.next().length();
        int g = 0;
        int e = 0;
        for(Map.Entry<Integer, Integer> entry : length_freq.entrySet()){
            if(entry.getKey()<l){
                g += entry.getValue();
            }else if(entry.getKey()==l){
                e += entry.getValue();
            }
        }
        int max = g + e - 1 + ((g+e-1)/k)*5 + 1;
        int min = g + (g/k)*5 + 1;
        System.out.println(min+" "+max);
    }
}
