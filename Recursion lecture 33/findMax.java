public class findMax {
    public static int Max(int arr[],int idx){
    
        //base case
        if(idx==arr.length-1){
            return arr[idx];
        }
        // sub problem
        int smallAns= Max(arr, idx+1);

        //self work
        return Math.max(arr[idx], smallAns);
    }
     public static void main(String[] args) {
        int arr[]={1,9,2,10,15};
        System.out.println(Max(arr,0));
     }
}
