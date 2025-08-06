import java.util.Arrays;

public class ArrayDescendingOrder {
    public static void main(String[] args) {
        
        int[] arr = {2, 6, 1, 8, 4};
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}

//Execution steps.
// Pass 1 (i = 0):
// Array before: [2, 6, 1, 8, 4]

// Compare 2 and 6 → 2 < 6 → ✅ Swap → [6, 2, 1, 8, 4]

// Compare 2 and 1 → 2 > 1 → ❌ No swap

// Compare 1 and 8 → 1 < 8 → ✅ Swap → [6, 2, 8, 1, 4]

// Compare 1 and 4 → 1 < 4 → ✅ Swap → [6, 2, 8, 4, 1]