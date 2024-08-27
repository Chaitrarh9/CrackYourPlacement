class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefixSum = 0;
        int result = 0;
        Map<Integer, Integer> remainderCounter = new HashMap<>();
        remainderCounter.put(0,1);

        for(int n: nums){
            prefixSum+=n;
            int remainder = (prefixSum % k + k) % k;
        

            if (remainderCounter.containsKey(remainder)) {
                    result += remainderCounter.get(remainder);
            }

            remainderCounter.put(remainder, remainderCounter.getOrDefault(remainder, 0) + 1);
        }

        return result;
        
    }
}