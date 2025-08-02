package Insersion_sort;

import java.util.Scanner;

public class Insersion_sort {
    static void insersion_sort(int []arr,int n){
        for(int i=1;i<n;i++){
            int j=i;{
                while(j>0 && arr[j]<arr[j-1]){
                    // Swap the elements if they are in the wrong order
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int array[]= {7,6,5,3,0,2,1};
        insersion_sort(array, array.length);
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}
