package xin.carryzheng.leetcode;

/**
 * #35
 * 题意是让你从一个没有重复元素的已排序数组中找到插入位置的索引。
 * 因为数组已排序，所以我们可以想到二分查找法，
 * 因为查找到的条件是找到第一个等于或者大于 target 的元素的位置，
 * 所以二分法略作变动即可。
 *
 * @author zhengxin
 * @date 2018-03-19 15:58:53
 */
public class SearchInsertPosition {

    public static void main(String[] args){

        int[] nums = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(nums, 7));
    }

    public static int searchInsert(int[] nums, int target) {

        int left = 0;

        int right = nums.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if (target <= nums[mid]) right = mid - 1;
            else left = mid + 1;

        }

        return left;

    }

}
