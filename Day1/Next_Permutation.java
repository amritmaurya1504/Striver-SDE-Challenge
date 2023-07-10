package Day1;

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Next_Permutation 
{
	public static void reverse(ArrayList<Integer> arr, int i, int j){
		int start = i + 1;
		int end = j;
		while(start < end){
			Collections.swap(arr, start, end);
			start++;
			end--;
		}
	}
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		int indx = -1;
        int n = permutation.size();
        // Finding breakpoint inside the permutation
        for(int i = n - 2; i >= 0; i--){
            if(permutation.get(i) < permutation.get(i+1)){
                indx = i;
                break;
            }
        }
		if(indx == -1){
			Collections.reverse(permutation);
			return permutation;
		}

		for(int i = n - 1; i > indx; i--){
			if(permutation.get(i) > permutation.get(indx)){
				Collections.swap(permutation, indx, i);
				break;
			}
		}

		reverse(permutation, indx, n-1);
		return permutation;
	}
}
