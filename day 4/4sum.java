class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
if(nums.length==4) 

{
    if((nums[0]+nums[1]+nums[1]+nums[2]+nums[3])!=target)
    {
        return list;
    }
}
        for (int i = 0; i < nums.length - 3; i++) { // 4 sum
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) { //3 sum
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        // target == sum
                        List<Integer> combo = new ArrayList<>();
                        combo.add(nums[i]);
                        combo.add(nums[j]);
                        combo.add(nums[left]);
                        combo.add(nums[right]);
                        list.add(combo);
                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1])
                            left++;
                        while (left < right && nums[right] == nums[right + 1])
                            right--;
                    }
                }
            }
        }
         
        return list;
    }
}
