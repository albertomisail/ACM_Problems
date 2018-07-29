//package Contest_100812;

import java.util.HashMap;
import java.util.Scanner;

public class D {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long number_of_elements = scanner.nextLong();
        HashMap<Long, Long[]> elements = new HashMap<>();
        elements.put(0L, new Long[]{-1L, -1L});
        long previous_value = 0;
        for(long i = 0; i < number_of_elements; i++){
            previous_value += scanner.nextLong();
            if(elements.containsKey(previous_value)){
                Long[] arr = elements.get(previous_value);
                if(arr[1]==-1){
                    arr[1] = i - arr[0];
                    arr[0] = i;
                }else if(arr[1]>i-arr[0]){
                    arr[1] = i - arr[0];
                    arr[0] = i;
                }
            }else{
                elements.put(previous_value, new Long[]{i, -1L});
            }
        }
        long minimum_distance = Long.MAX_VALUE;
        long index = -1;
        for(HashMap.Entry<Long, Long[]> entry : elements.entrySet()){
            Long[] arr = (Long[]) entry.getValue();
            if((arr[1] < minimum_distance && arr[1] != -1)){
                minimum_distance = arr[1];
                index = arr[0];
            }
        }
        if(minimum_distance != Long.MAX_VALUE){
            System.out.println((index-minimum_distance+2)+" "+(minimum_distance));
        }else{
            System.out.println(-1);
        }

//        int start = -1;
//        int length = -1;
//        for(int i = 0; i < number_of_elements; i++){
//            int sum = elements.get(i);
//            if(sum == 0){
//                System.out.println((i+1)+" "+1);
//                return;
//            }
//            for(int j = i + 1; j < number_of_elements; j++){
//                sum += elements.get(j);
//                if(sum == 0){
//                    if(j - i < length || length == -1){
//                        length = j - i;
//                        start = i;
//                    }
//                }
//            }
//        }
//        if(length == -1){
//            System.out.println(-1);
//            return;
//        }else{
//            System.out.println((start+1)+" "+(length+1));
//            return;
//        }
    }
}
