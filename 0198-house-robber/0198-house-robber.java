class Solution {
    public int rob(int[] nums) {
        int r=0;
        int nor=0;
        for(int i=0;i<nums.length;i++){
            int newr=nor+nums[i];
            int newnoR=Math.max(nor,r);
            r=newr;
            nor=newnoR;
        }
        return Math.max(r,nor);
    }
}