package String_Problems;

import java.util.Scanner;

public class A_785 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for(int i = 0; i < n; i++){
            String str = scanner.next();
            switch (str){
                case "Tetrahedron": result += 4;
                                    break;
                case "Cube": result += 6;
                             break;
                case "Octahedron": result += 8;
                                    break;
                case "Dodecahedron": result += 12;
                                    break;
                case "Icosahedron": result += 20;
                                    break;
                default: break;
            }
        }
        System.out.println(result);
    }
}
