// METHOF-1: CHECK WHETHERTHE NUMBER IS EVEN OR ODD BY BITWISE OPERATOR IN JAVA

package com.massey;
import java.util.Scanner;
public class CodeNum02 {
    static boolean isCheckNumByAndOperator(int num) {
        return ((num&1)!=1);
    }
    static boolean isCheckNumByOrOperator(int num) {
        if((num|1)>num)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        System.out.println(isCheckNumByAndOperator(num)==true?"Even By AND operator": "Odd By AND operator");
        System.out.println(isCheckNumByOrOperator(num)==true?"Even By OR operator": "Odd by OR Operator");
    }
    }

// METHOD-2: BRUTE FORCE

class CodeNum02b{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        if(num%2==0)
            System.out.println("even");
        else
            System.out.println("odd");

// METHOD-3: USING TERNARY OPERATOR

        String result = (num%2==0?"Even":"Odd");
        System.out.println(result);
    }
}


