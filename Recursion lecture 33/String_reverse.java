import java.util.Scanner;

public class String_reverse {
    static String reverse(String s,int idx){
        if(idx==s.length()){
            return "";
        }

        String smallAns = reverse(s,idx+1);
        Character currChar= s.charAt(idx);

        return smallAns+currChar;
    }

    //without idx
    static String reverse2(String s){
        if(s.length()==0){
            return "";
        }

        String smallAns = reverse2(s.substring(1));
        Character currChar= s.charAt(0);

        return smallAns+currChar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(reverse2(s)); 
        System.out.println(reverse(s,0)); 
    }
}
