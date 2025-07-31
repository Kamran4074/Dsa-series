public class printArray {
    public static void print(int arr[],int idx){
        //base cse
        if(idx==arr.length){
            return;
        }
        //self work
        System.out.println(arr[idx]);

        //sub problem
        print(arr,idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        print(arr, 0);
    }
}
