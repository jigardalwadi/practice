import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        if(nums.length < 3)
            return res;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1, k = nums.length-1; j < k && i < k; ){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> temp = new ArrayList();
                    temp.add(nums[i]); temp.add(nums[j]); temp.add(nums[k]);
                    if(!res.contains(temp))
                        res.add(temp);
                    j++;
                }
                else if (sum < 0){
                    j++;
                }
                else
                    k--;
            }
        }

        return res;
    }
}