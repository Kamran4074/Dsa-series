import java.util.Scanner;

public class string_remove_char {

    static String removeChar(String s,int idx){
        //base case
        if(idx==s.length()){
            return " ";
        }
        //sub problem
        String smallAns=removeChar(s, idx+1);

        //self work
        if(s.charAt(idx)!='a'){
            return s.charAt(idx)+smallAns;
        }
        else{
            return smallAns;
        }
    }

    // whitout using idx 
    //and using sub string method


    static String removeChar2(String s){
        //base case
        if(s.length()==0){
            return " ";
        }
        //sub problem
        String smallAns=removeChar2(s.substring(1));

        //self work
        if(s.charAt(0)!='a'){
            return s.charAt(0)+smallAns;
        }
        else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(removeChar2(s));
    }
}
