package ProblemSets;

import java.util.Scanner;

public class A_208 {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println(scanner.next().replace("WUB"," ").trim().replaceAll("\\s+", " "));
    }
}
