public class Last_idx_of_target {
    static int last_idx(int arr[],int idx,int target){
        //base case
        if(idx==0){
            return -1;
        }

        //self work
        if(arr[idx]==target){
            return idx;
        }
        //sub problem
        return last_idx(arr, idx-1, target);
    }

    public static void main(String[] args) {
        int arr[]={1,5,3,5,6};
        System.out.println(last_idx(arr, arr.length-1, 50));
    }
}
