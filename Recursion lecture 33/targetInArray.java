public class targetInArray {
    static int target(int arr[],int target,int idx){
        //base case
        if(idx==arr.length){
            return -1;
        }
        //self work
        if(arr[idx]==target){
            return idx;
        }
        //sub problm
        return target(arr, target, idx+1);

    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,4,9};
        System.out.println(target(arr, 9, 0));
    }
}
