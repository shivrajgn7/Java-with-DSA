package com.xwrokz.reverseDigits;

import java.util.Scanner;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character: ");
        String num=sc.next();
        int rev=0;


            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(num);
            System.out.println(" ");
            StringBuilder revv=stringBuilder.reverse();
            System.out.println("reverse valuse: "+revv);



    }
}
