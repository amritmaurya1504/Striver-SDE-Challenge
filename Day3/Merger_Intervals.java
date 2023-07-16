import java.util.*;

// Optimal One
// Time Complexity -> O(N)
class Solution {
    public int[][] merge(int[][] intervals) {
      List<int[]> list = new ArrayList<>();
      Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

      int start = intervals[0][0];
      int end = intervals[0][1];

      for(int i = 1; i < intervals.length; i++){
        if(intervals[i][0] <= end){
          // merging will happen
          end = intervals[i][1];
        }else{
          list.add(new int[]{start, end});
          start = intervals[i][0];
          end = intervals[i][1];
        }
      }
      list.add(new int[]{start, end});

      return list.toArray(new int[0][]);
    }
}


// BRUTE FORCE
// Time Complexity -> O(N2);
/*
class Solution {
    public int[][] merge(int[][] intervals) {
      List<int[]> list = new ArrayList<>();
      Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

      for(int i = 0; i < intervals.length; i++){
          int s = intervals[i][0];
          int e = intervals[i][1];

        //   skip merged intervals
          if(!list.isEmpty() && e <= list.get(list.size() - 1)[1]) continue;

        //   merging will happen
          for(int it = i + 1; it < intervals.length; it++){
              if(intervals[it][0] <= e){
                  e = Math.max(e, intervals[it][1]);
              }else{
                  break;
              }
          }

          list.add(new int[]{s,e});
      }

      return list.toArray(new int[0][]);
    }
}
*/