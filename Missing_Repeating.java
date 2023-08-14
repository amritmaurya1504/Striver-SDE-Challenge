public import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Missing_Repeating {
    // Approach 1
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] ans = new int[2];
        int[] freq = new int[n+1];
        for(int i = 0; i < n; i++){
            freq[arr.get(i)]++;
        }

        int rep = -1;
        int mis = -1;

        for(int i = 1; i <=n; i++){
            if(freq[i] == 0) mis = i;
            if(freq[i] > 1) rep = i;
        }

        return new int[]{mis,rep};
    }
}
