package Day2;
// Intuition: Since there is a duplicate number, we can always say that cycle will be formed.
// The slow pointer moves by one step and the fast pointer moves by 2 steps and there exists a cycle so the first collision is bound to happen.

class Solution {
    public int findDuplicate(int[] nums) {
        // Using LinkedList Begining of Cycle Detection Problem
        int slow = 0;
        int fast = 0;

        slow = nums[slow];
        fast = nums[nums[fast]];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = 0;

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }


        return fast;
    }
}



/**
class Solution {
    public int findDuplicate(int[] nums) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return 0;
    }
}


class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int ans = -1;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() > 1) ans = e.getKey();
        }

        return ans;
    }
}

 */