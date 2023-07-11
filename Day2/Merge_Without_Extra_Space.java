package Day2;
import java.util.*;

public class Merge_Without_Extra_Space{
    // 1st Approach
        //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
            int left = n-1;
            int right = 0;
            while(left >= 0 && right < m){
                if(arr1[left] > arr2[right]){
                    // swap it
                    long temp = arr1[left];
                    arr1[left] = arr2[right];
                    arr2[right] = temp;
                    left--;
                    right++;
                }else{
                    break;
                }
            }
            
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            // TC -> O(min(n,m)) + O(nlogn) + O(mlogm);
            // SC -> O(1);
    }

        // 2ND Approach -> 
        //Function to merge the arrays.
    public static void merge_arr(long arr1[], long arr2[], int n, int m) 
    {
        for(int i = 0; i < n; i++){
            if(arr1[i] > arr2[0]){
                // Swap;
                long temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }
            
            long first = arr2[0];
            int k;
            for(k = 1; k < m && arr2[k] < first; k++){
                arr2[k-1] = arr2[k];
            }
            
            arr2[k-1] = first;
            
        }
    }

}