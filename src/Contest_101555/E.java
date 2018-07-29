package Contest_101555;

import java.util.Scanner;

public class E {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String raw_patter = scanner.next();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < raw_patter.length(); i++){
            char c = raw_patter.charAt(i);
            if(c=='*'){
                s.append("([\\w\\s])*");
            }else if(c=='.'){
                s.append("\\.");
            }else{
                s.append(c);
            }
        }
        String pattern = s.toString();
        int number = scanner.nextInt();
        for(int i = 0; i < number; i++){
            String str = scanner.next();
            if(str.matches(pattern)){
                System.out.println(str);
            }
        }
    }
}
