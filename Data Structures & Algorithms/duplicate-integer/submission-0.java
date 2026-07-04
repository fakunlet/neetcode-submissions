class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> numbers = new HashSet<>();
        boolean isTrue = false;

        for (int i=0; i < nums.length && !isTrue; i++){
            if (numbers.contains(nums[i])){
                isTrue = true;
            }else{
                numbers.add(nums[i]);
            }

        }
        return isTrue;
    }
}