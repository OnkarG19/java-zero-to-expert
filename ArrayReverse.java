public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int temp = 0; 
        int[] rev = { };
        for(int i = 0; i < arr.length; i++){
            temp = arr[i];
            arr[i] = rev[0];
            rev[0] = temp;
        }
        System.out.println(rev);
    }
}
