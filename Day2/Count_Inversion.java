// BRUTE FORCE


import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        long count = 0;
        for(int i = 0; i < n; i++){
            for(int j = n - 1; j > i; j--){
                if(arr[i] > arr[j] && i < j){
                    count++;
                }
            }
        }
        return count;
    }
}


// OPTIMAL

import java.util.* ;
import java.io.*; 
public class Solution {
    public static long merge(int low, int mid, int high, long arr[]){
        ArrayList<Long> temp = new ArrayList<>();
        
        int left = low; 
        int right = mid+1;
        long count = 0;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            }else{
                count += (mid - left + 1);
                temp.add(arr[right++]);
            }
        }

        while(left <= mid) temp.add(arr[left++]);
        while(right <= high) temp.add(arr[right++]);
        
        // transfering all elements from temporary to arr //
        int k = 0;
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(k++);
        }

        return count;
    }
    public static long mergeSort(int left, int right, long arr[]){
        long count = 0;
        if(left >= right) return count;
        if(left < right){
            int mid = (left + right)/2;

            count += mergeSort(left, mid, arr);
            count += mergeSort(mid + 1, right, arr);
            count += merge(left, mid, right, arr);
        }

        return count;
    }
    public static long getInversions(long arr[], int n) {
        return mergeSort(0, n - 1, arr);
    }
}