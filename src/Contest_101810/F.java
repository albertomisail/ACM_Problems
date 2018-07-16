//import sun.text.resources.ro.CollationData_ro;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Collections;
//import java.lang.Math;
//
//public class F_14_7_2018 {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int number_of_tests = scanner.nextInt();
//        for(int test = 1; test <= number_of_tests; test++){
//            int length = scanner.nextInt();
//            ArrayList<Integer> values = new ArrayList<Integer>();
//            for(int i = 0; i < length; i++){
//                values.add(scanner.nextInt());
//            }
//            Collections.sort(values);
//            ArrayList<Integer> copy = new ArrayList<Integer>(values);
//            int max = values.get(length);
//            int sqrt = (int) Math.sqrt(max);
//            int result = 0;
//            int counter = 0;
//            while(!copy.isEmpty()){
//                int value = values.get(counter);
//                if(value > sqrt){
//                    break;
//                }
//                counter++;
//                for(Integer i : copy){
//                    if(i % value)
//                }
//            }
//            for(int i = values.size()-1; i >= 1; i--){
//                int value = values.get(i);
//                int sqrt = (int) Math.sqrt(value);
//                for(int j = 0; j < i; j++){
//                    int divisor = values.get(j);
//                    if(divisor > sqrt){
//                        break;
//                    }
//                    if(value % divisor == 0){
//                        values.set(i, divisor);
//                        break;
//                    }
//                }
//            }
//            int result = 0;
//            for(Integer i : values){
//                result += i;
//            }
//            System.out.println(result);
//        }
//    }
//}
