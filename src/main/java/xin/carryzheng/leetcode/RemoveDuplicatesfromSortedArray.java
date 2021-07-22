package xin.carryzheng.leetcode;

/**
 * #26
 * 题意是让你从一个有序的数组中移除重复的元素，并返回之后数组的长度。
 * 我的思路是判断长度小于等于 1 的话直接返回原长度即可，否则的话遍历一遍数组，
 * 用一个 tail 变量指向尾部，如果后面的元素和前面的元素不同，就让 tail 变量加一，
 * 最后返回 tail 即可。
 *
 * @author zhengxin
 * @date 2018-03-19 15:26:31
 */
public class RemoveDuplicatesfromSortedArray {


    public static void main(String[] args){

        int[] nums = new int[]{1, 2, 2, 2, 3, 3, 7};

        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {

        int len = nums.length;

        if(len <= 1) {
          return len;
        }

        int tail = 1;

        for (int i=1; i<len; ++i){

            if(nums[i-1] != nums[i]) {
              nums[tail++] = nums[i];
            }

        }

        return tail;

    }
}
