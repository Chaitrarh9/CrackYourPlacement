class Solution {
    public void moveZeroes(int[] nums) {
        int temp;
        int n = nums.length;
        int left = 0;
        for(int right=0;right<=n-1;right++){
            if(nums[right]!=0){
                temp = nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
        }
        
    }
}