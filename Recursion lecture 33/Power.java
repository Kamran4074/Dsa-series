import java.util.Scanner;

public class Power {
    static int pow(int p,int q){
        if(q==0){
            return 1;
        }
        //sub problem
        int smallAns= pow(p,q-1);

        //self work
        return smallAns*p;
    }
    static int pow2(int p,int q){
        if(q==0){
            return 1;
        }
        //sub problem
        int pow = pow(p, q/2); 
        // q/2 + q/2 = q

        //self work
        if(q%2==0){
            return pow*pow;
        }
        else return p*pow*pow;
    }

    static void multiple(int n,int k){
        // if(k==1){
        //     System.out.println(n);
        //     return ;
        // }
        //or
        if(k==0){
            return;
        }
        multiple(n, k-1);
        System.out.println(n*k);
    }

    static int seqSum(int n){
        if(n==0){
            return n;
        }
        int tSum=seqSum(n-1);
        if(n%2==0){
            return seqSum(n-1)-n;
        }
        return seqSum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(2==2){
            System.out.print("Enter number: ");
            int a=sc.nextInt();
            System.out.println(seqSum(a));
        }
    }
}
