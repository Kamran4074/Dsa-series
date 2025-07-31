public class isSorted {

    static boolean is_sorted(int arr[],int idx){
        //base case
        if(idx==arr.length-1 || arr.length==0){
            return true;
        }
        //self work
        if(arr[idx]>arr[idx+1]){
            return false;
        }

        //sub problem
        return is_sorted(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,10,4,6};
        System.out.println( is_sorted(arr, 0));
    }
}
