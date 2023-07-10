package Day1;

import java.util.ArrayList;
import java.util.List;

public class Pacal_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> subAns = null;
		int[][] pascalTri = new int[numRows][numRows];

        for(int i = 0; i < numRows; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    pascalTri[i][j] = 1;
                }else{
                    pascalTri[i][j] = pascalTri[i-1][j-1] + pascalTri[i-1][j];
                }
            }
        }

        for(int i = 0; i < numRows; i++){
            subAns = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                subAns.add(pascalTri[i][j]);
            }
            res.add(subAns);
        }

		return res;
    }
}



class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row, pre = null;
		for (int i = 0; i < numRows; ++i) {
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j)
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j));
			pre = row;
			res.add(row);
		}
		return res;
    }
}
