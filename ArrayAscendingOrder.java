import java.util.Arrays;

public class ArrayAscendingOrder {

    public static void main(String[] args) {
         int[] arr = {2, 6, 1, 8, 4};
         int n = arr.length;

// Outer loop for number of passes
for (int i = 0; i < n - 1; i++) {
    // Inner loop for comparing adjacent elements
    for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            // Swap if the element found is greater than the next element
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }
}
System.out.println(Arrays.toString(arr));
System.err.println(arr.length);
          
         Arrays.sort(arr);

         System.out.println("Sorting of Array: " + Arrays.toString(arr));
    }
}

//Execution steps.
    // First pass (i = 0):

    // Compare 2 and 6 → OK

    // Compare 6 and 1 → Swap → [2, 1, 6, 8, 4]

    // Compare 6 and 8 → OK

    // Compare 8 and 4 → Swap → [2, 1, 6, 4, 8]

    // Second pass (i = 1):

    // Compare 2 and 1 → Swap → [1, 2, 6, 4, 8]

    // Compare 2 and 6 → OK

    // Compare 6 and 4 → Swap → [1, 2, 4, 6, 8]

    // Third pass (i = 2):

    // Compare 1 and 2 → OK

    // Compare 2 and 4 → OK

    // Fourth pass (i = 3):

    // Compare 1 and 2 → OK

    