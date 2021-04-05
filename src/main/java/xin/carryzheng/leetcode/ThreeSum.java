package xin.carryzheng.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * #15
 *
 * @author zhengxin
 * @date 2021-04-05 23:42:48
 */
public class ThreeSum {

    public static void main(String[] args) {


        List<List<Integer>> result = new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        result.forEach(System.out::println);

    }

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int start = i + 1, end = nums.length - 1;
                while (start < end) {
                    if (nums[i] + nums[start] + nums[end] == 0) {
                        result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                        start++;
                        end--;
                        while (start < end && nums[start] == nums[start - 1]) {
                            start++;
                        }
                        while (start < end && nums[end] == nums[end + 1]) {
                            end--;
                        }
                    } else if (nums[i] + nums[start] + nums[end] < 0) {
                        start++;
                    } else {
                        end--;
                    }

                }
            }
        }
        return result;

    }
}
