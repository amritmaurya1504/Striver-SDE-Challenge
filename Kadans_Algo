

public class Kadans_Algo {
    public static long maxSubarraySum(int[] arr, int n) {
		long max_sum = 0;
		long curr_Sum = 0;

		for(int i = 0; i < n; i++){
			curr_Sum += arr[i];

			if(curr_Sum > max_sum){
				max_sum = curr_Sum;
			}


			if(curr_Sum < 0){
				curr_Sum = 0;
			}
		}

		return max_sum;
	}

}
