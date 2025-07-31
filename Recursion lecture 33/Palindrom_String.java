import java.util.Scanner;

public class Palindrom_String {

    static boolean palindrome(String s,int left,int right){
        //base case
        if(left>=right){
            return true;
        }
        //self work
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        //sub problem
        return palindrome(s, left+1, right-1);
    }
    public static void main(String[] args) {
        while(1==1){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
    
            System.out.println(palindrome(s,0,s.length()-1));
        }
    }
}
