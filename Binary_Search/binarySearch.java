package Binary_Search;

public class binarySearch {
    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int result= -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid; // Store the index of the found element
                // Check if there are more occurrences of the target
                end = mid-1;
            } 
            else if (arr[mid] < target) {
                start = mid + 1; // Search in the right half
            } 
            else {
                end = mid - 1; // Search in the left half
            }
        }
        return result; 
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;

        int result = binarySearch(arr, target);
        System.out.println("Element found at index: " + result);
        }
    }
