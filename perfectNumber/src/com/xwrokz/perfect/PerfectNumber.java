package com.xwrokz.perfect;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        int n=num;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
                sum=sum+i;
        }
        if(n==sum)
            System.out.println("its Perfect");
        else
            System.out.println("Not perfect");
    }
}
