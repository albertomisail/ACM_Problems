package String_Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_141 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char[] str1 = scanner.next().toCharArray();
        char[] str2 = scanner.next().toCharArray();
        char[] str3 = scanner.next().toCharArray();
        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();
        for(Character c : str1){
            if(freq1.containsKey(c)){
                freq1.put(c, freq1.get(c)+1);
            }else{
                freq1.put(c, 1);
            }
        }
        for(Character c : str2){
            if(freq1.containsKey(c)){
                freq1.put(c, freq1.get(c)+1);
            }else{
                freq1.put(c, 1);
            }
        }
        for(Character c : str3){
            if(freq2.containsKey(c)){
                freq2.put(c, freq2.get(c)+1);
            }else{
                freq2.put(c, 1);
            }
        }
        if(freq1.size()!=freq2.size()){
            System.out.println("NO");
            return;
        }
        for(Map.Entry<Character, Integer> entry : freq1.entrySet()){
            Character c = entry.getKey();
            Integer i = entry.getValue();
            if(i!=freq2.get(c)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
