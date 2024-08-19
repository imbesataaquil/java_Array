package Array;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        int sum = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array : ");
    for (int i = 0 ; i < n ; i ++) {
    arr[i]=sc.nextInt();
    }
    for (int i = 0 ; i<n ; i ++){
        sum = sum +arr[i] ;
    }
    double avr= (double) sum/n;
        System.out.println("sum of array : "+sum);
        System.out.println("average of array : "+avr);
}

    }

