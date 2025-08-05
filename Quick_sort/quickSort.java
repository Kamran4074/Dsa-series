package Quick_sort;

public class quickSort {
    static void display(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int arr[],int start,int end){
        int pivot=arr[start];
        int cnt=0;
        
        for(int i=start+1;i<=end;i++){
            if(arr[i]<=pivot) cnt++;
        }
        
        int pivot_idx=start+cnt;
        swap(arr,start,pivot_idx);
        int i=start,j=end;
        while(i<pivot_idx &&j>pivot_idx){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            
            if(i<pivot_idx &&j>pivot_idx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivot_idx;
    }
    static void quickSort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int pi=partition(arr,start,end);
        quickSort(arr,start,pi-1);
        quickSort(arr,pi+1,end);
    }
	public static void main(String[] args) {
		int arr[]= {1,6,4,3,8,9,0};

		System.out.print("Array before sorting: ");
		display(arr);
		
		quickSort(arr,0,arr.length-1);
        
		System.out.print("\nArray after sorting: ");
		display(arr);
	}
}
