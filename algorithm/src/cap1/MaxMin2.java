package cap1;

import java.util.Arrays;

public class MaxMin2 {
    public static int[] maxMin2(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            } else if (arr[i] > max){
                max = arr[i];
            }
        }
        int[] maxMin = new int[2];
        maxMin[0] = min;
        maxMin[1] = max;
        return maxMin;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6,5};
        System.out.println(Arrays.toString(maxMin2(arr)));
    }
}
