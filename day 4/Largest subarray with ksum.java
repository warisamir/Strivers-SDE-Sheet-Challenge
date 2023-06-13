class Solution {
    public int longestConsecutive(int[] nums) {
      int n=nums.length;
       HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int max=0;
        for(int i:nums){
           if(!hs.contains(i-1)){
               int cNum=i;
               int streak=1;
               while(hs.contains(cNum+1)){
                   cNum+=1;
                   streak+=1;
               }
               max=Math.max(streak,max);
           }
        }
        return max;
    }
}
