class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int n = nums.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j] == target){
        //             return  new int []{i,j};
        //         }
        //     }
        // }
        HashMap<Integer, Integer> mapper = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (mapper.containsKey(diff)) {
                return new int[] { mapper.get(diff), i };
            }
            mapper.put(nums[i], i);
        }
        return new int[] {};
    }
}