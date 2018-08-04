package String_Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_219 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        char[] arr = scanner.next().toCharArray();
        if(arr.length%k!=0){
            System.out.println(-1);
            return;
        }
        HashMap<Character, Integer> freqs = new HashMap<>();
        for(Character c : arr){
            if(freqs.containsKey(c)){
                freqs.put(c, freqs.get(c)+1);
            }else{
                freqs.put(c, 1);
            }
        }
        StringBuilder s = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : freqs.entrySet()){
            if(entry.getValue()%k!=0){
                System.out.println(-1);
                return;
            }else{
                for(int i = 0; i < entry.getValue()/k; i++){
                    s.append(entry.getKey());
                }
            }
        }
        StringBuilder r = new StringBuilder();
        String str = s.toString();
        for(int i = 0; i < k; i++){
            r.append(str);
        }
        System.out.println(r);
    }
}
