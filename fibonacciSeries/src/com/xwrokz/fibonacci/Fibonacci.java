package com.xwrokz.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int n1=0,n2=1,sum=0;
        for(int i=2;i<num;i++){
            sum=n1+n2;
            System.out.println(" "+sum);
            n1=n2;
            n2=sum;
        }
    }
}
