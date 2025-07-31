import java.util.ArrayList;
import java.util.Scanner;

public class string_subsequence {
    static ArrayList<String> subsequence(String s){
        ArrayList<String> ans= new ArrayList<>();
        //base case
        if(s.length()==0){
            ans.add("");
            return ans;
        }

        char crr = s.charAt(0);
        //sub problem
        ArrayList<String> smallAns=subsequence(s.substring(1));

        //self work
        for(String ss:smallAns){
            ans.add(ss);
            ans.add(crr+ss);
            //crr at line 13
            // ans.add(s.charAt(0)+ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        while(1==1){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println(subsequence(s));
        }
    }
}
