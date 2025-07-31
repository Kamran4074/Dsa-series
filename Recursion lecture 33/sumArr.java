public class sumArr {
    static int sum(int arr[],int idx){
        //base case
        if(idx==arr.length-1){
            return arr[idx];
        }
        //sub problem
        int smallAns= sum(arr, idx+1);

        //self work
        return smallAns+arr[idx];
    }
    public static void main(String[] args) {
        int arr[]={1,2,3}; 
        System.out.println(sum(arr, 0));
    }
}
