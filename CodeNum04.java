// FIND THE N NATURAL NUMBERS BITWEEN RANGE IN JAVA

package com.massey;
import java.util.Scanner;
public class CodeNum04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int range1 = in.nextInt();
        int range2 = in.nextInt();
        int sum =0;

// METHOD 3: BY USING LOOP

        for(int i=range1; i<=range2; i++)
            sum += i;
            System.out.println(sum + " Sum bitween range by Method1");

 // METHOD 2: BY USING FORMULA

        int result = range2*(range2+1)/2 - range1*(range1+1)/2 + range1;
        System.out.println(result + " Sum bitween range by Method2");
    }
}
