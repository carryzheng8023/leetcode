package xin.carryzheng.leetcode;

import xin.carryzheng.utils.Utils;

import java.util.HashMap;
import java.util.Map;

/**
 * #1
 * Created by zhengxin on 17/12/14.
 */
public class TwoSum {

    public static void main(String[] args){

        int[] ints = new int[]{2, 7, 11, 15};

//        Utils.traverse(TwoSum.twoSum(ints, 9));
        Utils.traverse(TwoSum.twoSum2(ints, 9));

    }

    public static int[] twoSum(int[] nums, int target) {


        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++){

            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);

        }

        return null;

    }
}
