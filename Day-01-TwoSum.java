import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int a = target - nums[i];
            if(map.containsKey(a)) {
                return new int[]{map.get(a), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // If no solution
    }

     public static void main(String[] args) 
    {
        Solution obj = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = obj.twoSum(nums, target);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
