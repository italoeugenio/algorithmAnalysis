package cap1;

public class Max {
    public static int max(int arr[]){
        int max = arr[0];
        for(int i = 1 ; i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,6,5};
        System.out.println(max(arr));
    }
}
