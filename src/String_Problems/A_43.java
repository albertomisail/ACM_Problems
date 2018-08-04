//package String_Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_43 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String, Integer> freqs = new HashMap<>();
        for(int i = 0; i < n; i++){
            String s = scanner.next();
            if(freqs.containsKey(s)){
                freqs.put(s, freqs.get(s)+1);
            }else{
                freqs.put(s,1);
            }
        }
        int max = Integer.MIN_VALUE;
        String result = null;
        for(Map.Entry<String, Integer> entry : freqs.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        System.out.println(result);
    }
}
