// FIND THE GREATEST  OF TWO NUMBERS IN JAVA

package com.massey;
import java.util.Scanner;
public class CodeNum05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();

// METHOD-1: BY USING IF ELSE-IF STATEMENTS

        if(num1==num2)
            System.out.println("Both are equal BY METHOD-1");
        else if (num1>num2)
            System.out.println("num1 is greatest BY METHOD-1");
        else
            System.out.println("num2 is greatest BY METHOD-1");

// METHOD-2: BY USING TERNARY OPERATOR

        if(num1==num2)
            System.out.println("Both are equal BY METHOD-2");
        else {
            String result = (num1 > num2 ? "num1 is greatest" : "num2 is greatest");
            System.out.println(result+"  BY METHOD-2");}

// METHOD-3: BY USING INBUILT MAX FUNCTON

        if(num1==num2)
            System.out.println("Both are equal BY METHOD-3");
        else
            System.out.println(Math.max(num1,num2)+ " is greatest BY METHOD3");
    }
}
