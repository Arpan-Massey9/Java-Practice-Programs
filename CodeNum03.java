// FIND THE SUM OF N NATURAL NUMBERS IN JAVA

package com.massey;
import java.util.Scanner;
public class CodeNum03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
    // METHOD-1: USING THE LOOP
        for(int i=1; i<=n; i++)
            sum += i;
        System.out.println("Using loop sum is : " + sum);

    // METHOD-2: USING FORMULA
        System.out.println("Using formula sum is : " + (n*(n+1)/2));
    }
}

    class Method3{
    static int recurrGetSum(int num){
        if(num<=1|num==0)
            return num;
            return num + recurrGetSum (num-1);
    }
    public static void main(String[] args) {
            Scanner in= new Scanner(System.in);
            int num = in.nextInt();
            System.out.println(recurrGetSum(num));
        }
    }
