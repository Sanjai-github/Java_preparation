package com.sanjai.arrays.searching;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Array size : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the "+ n + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target element : ");
        int target = in.nextInt();
        int ans = BinSearch(arr,target);
        System.out.println(ans);
    }
    static int BinSearch(int []arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start+(end - start)/2;
            if(target == arr[mid]){
                return mid;
            }else if (target > mid) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }
        return -1;
    }
}
