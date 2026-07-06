class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] toReturn = new int[2];
        int match;

        Map <Integer, Integer> arrayNums = new HashMap <>();

        for (int i = 0; i < nums.length; i++){
            arrayNums.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            if (target < 0){
                match = target + -1 * (nums[i]);
            }else{
                match = target - nums[i];
            }
            
            if (arrayNums.containsKey(match) && i != arrayNums.get(match)){
                toReturn = new int[]{i, arrayNums.get(match)};
                return toReturn;
            }
        }
         return toReturn;
    }
}
