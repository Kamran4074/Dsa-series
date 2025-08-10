package Binary_Search;

public class rotated_sorted_array {
    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Found the target
            }

            // Determine which side is sorted
            if (arr[start] <= arr[mid]) { // Left side is sorted
                if (arr[start]<=target && target < arr[mid]) {
                    end = mid - 1; // Search in the left half
                } else {
                    start = mid + 1; // Search in the right half
                }
            } else { // Right side is sorted
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1; // Search in the right half
                } else {
                    end = mid - 1; // Search in the left half
                }
            }
        }
        return -1; // Target not found
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; 
        int result = search(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
