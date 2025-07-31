import java.util.Scanner;

public class string_Subsequence_without_arraylist {

    static void subsequence2(String s,String crrAns){

        if(s.length()==0){
            System.out.print(crrAns+" ");
            return;
        }

        char crr= s.charAt(0);
        String rem=s.substring(1);

        //choose curr to add in string
        subsequence2(rem, crrAns+crr);

        //dont choose
        subsequence2(rem, crrAns);

    }
    public static void main(String[] args) {
        
        while(3==3){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            subsequence2(s, "");
        }
    }
}
