package Selection_sort;

public class selection_sort {
    static void selection_sort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[idx]){
                    idx=j;
                }
            }
            if(i!=idx) {
                // Swap the found minimum element with the first element
            int temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {7,6,5,4,3};

        selection_sort(arr, arr.length);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
