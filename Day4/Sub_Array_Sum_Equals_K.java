class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int cumulativeSum = 0;
        int count = 0;
        for (int num : nums) {
            cumulativeSum += num; 
            if (map.containsKey(cumulativeSum - k)) {
                count += map.get(cumulativeSum - k); 
            }
            map.put(cumulativeSum, map.getOrDefault(cumulativeSum, 0) + 1);
        }
        
        return count;
    }
}