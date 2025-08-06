public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8};
        int n = arr.length;
        int temp = 0 ;
        for(int i = 0; i < n; i++){            
            temp += arr[i];
        }
        System.err.println("Sum of Array is: " + temp);
    }
}
