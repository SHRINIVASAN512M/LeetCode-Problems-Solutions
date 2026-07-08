class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i > 0 && nums[i]== nums[i-1]){
                continue;
            }
            int leftj = i+1;
            int rightk = nums.length-1;

            while(leftj < rightk){
                int currentsum = nums[i] + nums[leftj] + nums[rightk];
                if(currentsum<0){
                    leftj++;
                } else if(currentsum>0){
                    rightk--;
                }
                else {
                    result.add(Arrays.asList(nums[i],nums[leftj],nums[rightk]));
                    leftj++;
                    rightk--;

                    while(leftj<rightk && nums[leftj]==nums[leftj-1]){
                        leftj++;
                    }
                     while (leftj < rightk && nums[rightk] == nums[rightk + 1]) {
                        rightk--;
                    }
                }
            }
        }
        return result;
    }
}