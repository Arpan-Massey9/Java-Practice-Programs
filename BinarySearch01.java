// PROGRAM TO SEARCH AN ELEMENT IN REVERSE SORTED ARRAY

package com.massey;
public class BinarySearch01 {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1,};
        int n= arr.length;
        int x=1;
        System.out.println(reverseBS(arr,n,x));
    }

    static int reverseBS(int []arr,int n, int x){
        int start=0;
        int end= n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
}
