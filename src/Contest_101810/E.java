package Contest_101810;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class E {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long modulo = (long)(Math.pow(10, 9) + 7);
        long number_of_tests = scanner.nextInt();
        for(long test = 1; test <= number_of_tests; test++){
            long length = scanner.nextLong();
            ArrayList<Long> values = new ArrayList<Long>();
            long product = 1;
            for(long i = 0; i < length; i++){
                long value = scanner.nextLong();
                values.add(value);
                product = (product * value) % modulo;
            }
            long result = (product * length) % modulo;
            for(Long l : values){
//                System.out.println(calculateModularInverse(l, modulo, modulo - 2));
                result -= (product *  calculateModularInverse(l, modulo, modulo - 2)) % modulo;
            }
            System.out.println(result % modulo);
        }
    }
//
//    public static long calculateModularInverse(long a,long m)
//    {
//        long c1 = 1;
//        long c2 = -(m/a); //coeficiente de a y b respectivamente
//        long t1 = 0;
//        long t2 = 1; //coeficientes penultima corrida
//        long r = m % a; //residuo, asignamos 1 como condicion de entrada
//        long x=a,y=r,c;
//        while(r!=0)
//        {
//            c = x/y;//cociente
//            r = x%y;//residuo
//            //guardamos valores temporales de los coeficientes
//            //multiplicamos los coeficiente por -1*cociente de la division
//            c1*=-c;
//            c2*=-c;
//            //sumamos la corrida anterior
//            c1+=t1;
//            c2+=t2;
//            //actualizamos corrida anterior
//            t1=-(c1-t1)/c;
//            t2=-(c2-t2)/c;
//            x=y;
//            y=r;
//        }
//        return t2;
//    }
    public static long calculateModularInverse(long x, long modulo, long exponent){
        if(exponent == 1){
            return x % modulo;
        }else if(exponent % 2 == 0){
            long a = calculateModularInverse(x, modulo, exponent / 2);
            return (a * a) % modulo;
//            return (long)Math.pow(calculateModularInverse(x, modulo, exponent / 2), 2) % modulo;
        }else{
            return (x * calculateModularInverse(x, modulo, exponent - 1)) % modulo;
        }
    }
}
