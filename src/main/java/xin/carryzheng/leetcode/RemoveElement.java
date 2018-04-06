package xin.carryzheng.leetcode;

/**
 * #27
 * 题意是移除数组中值等于 val 的元素，并返回之后数组的长度，
 * 并且题目中指定空间复杂度为 O(1)，
 * 我的思路是用 tail 标记尾部，遍历该数组时当索引元素不等于 val 时，tail 加一，
 * 尾部指向当前元素，最后返回 tail 即可。
 *
 * @author zhengxin
 * @date 2018-03-19 15:51:03
 */
public class RemoveElement {

    public static void main(String[] args){

        int[] nums = new int[]{1, 2, 2, 2, 3, 3, 7};

        System.out.println(removeElement(nums, 3));

    }

    public static int removeElement(int[] nums, int val) {

        int tail = 0;

        for (int i=0, len=nums.length; i<len; ++i){

            if (val != nums[i]){
                nums[tail++] = nums[i];
            }

        }

        return tail;

    }
}
