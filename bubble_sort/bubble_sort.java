package bubble_sort;
// Bubble Sort in Java
public class bubble_sort {

    static void Bubblesort(int arr[],int n){
        for(int i=0;i<n-1;i++){

            //for best case optimization
            // if no swaps are made, the array is already sorted
            // and we can exit early
            boolean flag=true;
            
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {7,6,5,4,3};
        // {1,8,5,9,4,0}

        Bubblesort(arr, arr.length);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
