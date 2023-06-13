class Solution {
    public int findDuplicate(int[] nums) {
        
       for(int i=0;i<nums.length;i++){
         int  id=Math.abs(nums[i])-1;
           nums[id]=nums[id]*-1;
           if(nums[id]>0)
          return Math.abs(nums[i]);     
       }
        return 0;
    }
    }
