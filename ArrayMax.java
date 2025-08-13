public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,7};
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
        }
}
// Initial Setup
// java
// int[] arr = {3, 9, 2, 5};
// int max = arr[0]; // max = 3 (initialized to first element)
// Iteration 1: Compare max (3) with arr[1] (9)
// java
// for (int i = 1; i < arr.length; i++) {
//     // i = 1, arr[1] = 9
//     if (arr[i] > max) { // 9 > 3? → TRUE
//         max = arr[i];   // Update max to 9
//     }
// }
// State after Iteration 1:

// max changes from 3 → 9

// Why? Because 9 is larger than the current max (3).

// Iteration 2: Compare max (9) with arr[2] (2)
// java
//     // i = 2, arr[2] = 2
//     if (arr[i] > max) { // 2 > 9? → FALSE
//         // max remains 9 (no update)
//     }
// State after Iteration 2:

// max stays 9

// Why? Because 2 is smaller than the current max (9).

