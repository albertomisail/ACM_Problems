package String_Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_499 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<String, String> translation = new HashMap<>();
        String[] arr = new String[n];
        for(int i = 0; i < m; i++){
            translation.put(scanner.next(), scanner.next());
        }
        for(int i = 0; i < n; i++){
            arr[i] = scanner.next();
        }
        StringBuilder s = new StringBuilder();
        for(String str : arr){
            if(str.length()<=translation.get(str).length()){
                s.append(str);
            }else{
                s.append(translation.get(str));
            }
            s.append(" ");
        }
        System.out.println(s.deleteCharAt(s.length()-1).toString());
    }
}
