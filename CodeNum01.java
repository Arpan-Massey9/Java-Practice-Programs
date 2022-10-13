// CHECK IF A NUMBER IS POSTIVE OR NEGATIVE IN JAVA

package com.massey;
import java.util.Scanner;
public class CodeNum01 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num= in.nextInt();

        // METHOD 1: BRUTE FORCE (by using elseif ladder)
        if(num>0)
            System.out.println("Entered num is positive BY METHOD1");
            else if(num<0)
                System.out.println("Entered num is negative BY METHOD1");
        else
            System.out.println("Entered num is neither positive nor negative but zero BY METHOD1");

        // METHOD 2: NESTED IF ELSE LADDER
        if(num>=0) {
            if (num == 0)
                System.out.println("Entered num is neither positive nor negative but zero BY METHOD2");
            else
                System.out.println("Entered num is positive BY METHOD2");}
        else
            System.out.println("Entered num is negative BY METHOD2");

        // METHOD 3: BY USING TERNARY OPERATOR
        if(num==0)
            System.out.println("Entered num is neither positive nor negative but zero BY METHOD3");
        else{
            String result = (num>0?"Entered num is positive BY METHOD3":"Entered num is negative BY METHOD3");
            System.out.println(result);}
    }
}
