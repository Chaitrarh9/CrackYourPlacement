class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<k;i++){
            leftsum+= cardPoints[i];
        }
        int maxsum=leftsum;
        int rightin=cardPoints.length-1;

        for(int i=k-1; i>=0; i--){
            leftsum-= cardPoints[i];
            rightsum+= cardPoints[rightin];
            rightin--;
            maxsum= Math.max(maxsum, leftsum+rightsum);
        }
        return maxsum;
    }
}