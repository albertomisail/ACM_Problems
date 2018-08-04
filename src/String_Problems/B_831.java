package String_Problems;

import java.util.HashMap;
import java.util.Scanner;

public class B_831 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char[] arr1 = scanner.next().toCharArray();
        char[] arr2 = scanner.next().toCharArray();
        HashMap<Character, Character> map = new HashMap<>();
        for(int i = 0; i < arr1.length; i++){
            map.put(arr1[i], arr2[i]);
            map.put(Character.toUpperCase(arr1[i]), Character.toUpperCase(arr2[i]));
        }
        char[] arr3 = scanner.next().toCharArray();
        StringBuilder sb = new StringBuilder();
        for(Character c : arr3){
            if(map.containsKey(c)) {
                sb.append(map.get(c));
            }else{
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
