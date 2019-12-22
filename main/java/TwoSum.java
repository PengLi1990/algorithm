import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //一遍hash即可
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0;i< nums.length;i++){
            int ele = target - nums[i];
            if(map.containsKey(ele)){
                return new int[] { map.get(ele), i };
            }
            map.put(nums[i],i);
        }

        return null;
    }
}
