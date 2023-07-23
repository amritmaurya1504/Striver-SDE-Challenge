import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
       int n = mat.size();
       int m = mat.get(0).size(); 
       int l = 0, h = m * n - 1;
       while(l <= h){
           int mid = l + (h - l)/2;
           if(mat.get(mid/m).get(mid%m) == target) return true;

           if(mat.get(mid/m).get(mid%m) < target) l = mid + 1;
           else h = mid - 1;
       }
       return false;
    }
}
