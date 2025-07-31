public class idxAll {
    static void All_idx(int arr[],int target,int idx){
        //base case
        if(idx==arr.length){
            return;
        }
        //self work
        if(arr[idx]==target){
            System.out.print(idx+" ");;
        }
        //sub problm
        All_idx(arr, target, idx+1);

    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,4,9};
        All_idx(arr, 9, 0);
    }
}
