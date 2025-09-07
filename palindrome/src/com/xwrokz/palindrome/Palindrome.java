package com.xwrokz.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int rev=0;
        int rev_num=num;

        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
            System.out.println(rev);
        }
        if(rev_num==rev){
            System.out.println(num+" is palindrome:");

        }else{
            System.out.println(num+" not a palindrome");
        }
    }
}
