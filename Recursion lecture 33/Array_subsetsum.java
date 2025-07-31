import java.util.Scanner;

public class Array_subsetsum {
    static void subsetsum(int arr[],int n,int idx,int crrSum){

        if(idx==n){
            System.out.print(crrSum +" ");
            return;
        }

        //add crr idx
        subsetsum(arr, n, idx+1, crrSum+arr[idx]);
    
        //not add crr idx
        subsetsum(arr, n, idx+1, crrSum);

    }
    public static void main(String[] args) {
        while(1==1){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of array: ");
            int n= sc.nextInt();

            int arr[]= new int[n];
            System.out.println("Enter the array: ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.print("subset sum are: ");
            subsetsum(arr, n, 0, 0);
        }
    }
}
