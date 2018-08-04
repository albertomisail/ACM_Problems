package String_Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_977 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        HashMap<String, Integer> freqs = new HashMap<>();
        for(int i = 0; i < str.length()-1; i++){
            String gram = str.substring(i,i+2);
            if(freqs.containsKey(gram)){
                freqs.put(gram, freqs.get(gram)+1);
            }else{
                freqs.put(gram, 1);
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
