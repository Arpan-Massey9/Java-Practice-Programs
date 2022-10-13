// FIND THE LARGEST OF THREE NUMBERS IN JAVA
package com.massey;
import java.util.Scanner;
public class CodeNum06 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num1,num2,num3,temp1,temp2,temp3;

        System.out.print("Enter num1 : ");
        num1 = input.nextInt();

        System.out.print("Enter num2 : ");
        num2 = input.nextInt();

        System.out.print("Enter num3 : ");
        num3 = input.nextInt();

//METHOD-1 BY TERNARY OPERATOR(PART1)

        temp1 = num1>num2?num1:num2;
        temp2 = num3>temp1?num3:temp1;
        System.out.println(temp2+" is largest BY METHOD-1");

//METHOD-2 BY TERNARY OPERATOR (PART2)

        temp3 = num3 > (num1>num2?num1:num2) ? num3 : (num1>num2?num1:num2);
        System.out.println(temp3+" is largest BY METHOD-2");

//METHOD-3 BY  ELSE-IF STATEMENTS

        if(num1>=num2 && num1>=num2)
            System.out.println(num1+" is largest BY METHOD-3");
        else if(num2>=num1 && num2>num3)
            System.out.println(num2+" is largest BY METHOD-3");
        else
            System.out.println(num3+" is largest BY METHOD-3");

//METHOD-4 BY NESTED LADDER

        if(num1>num2){
            if(num1>num3)
                System.out.println(num1+" is largest BY METHOD-4");
            else
                System.out.println(num2+" is largest BY METHOD-4");}
        else
            if(num2>num3)
                System.out.println(num2+" is largest BY METHOD-4");
            else
                System.out.println(num3+" is largest BY METHOD-4");









    }
}
