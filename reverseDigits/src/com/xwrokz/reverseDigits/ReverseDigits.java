package com.xwrokz.reverseDigits;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        /*int rev=0;
        int rev_num=num;
        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
            System.out.println(rev_num);
        }
        System.out.println("The reverse number is: "+rev);
    }*/
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();
        System.out.println(rev);
    }
}
