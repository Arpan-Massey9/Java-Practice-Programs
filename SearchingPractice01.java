// CODE FOR BINARY SEARCH IN ARRAY

package com.massey;

public class SearchingPractice01 {
    public static void main(String[] args) {
       int []arr={10,10};
       int n=2;
       int target=10;
       System.out.println(bSearch(arr,n,target));
    }
    static int bSearch(int []arr,int n,int target) {
        int low=0;
        int high=n-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==target)
                return mid;
            else if (arr[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
        }
    }

