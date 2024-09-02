class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] res = new int[n1];
        Map<Integer,Integer> hm = new HashMap<>();
        Deque<Integer> s = new ArrayDeque<>();
        for(int i=0;i<n2;i++)
        {
            while(!s.isEmpty() && nums2[i]>s.peek())
            {
                hm.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        }
        while(!s.isEmpty()) hm.put(s.pop(),-1);
        for(int i=0;i<n1;i++)
        {
            res[i] = hm.get(nums1[i]);
        }
        return res;
    }
}