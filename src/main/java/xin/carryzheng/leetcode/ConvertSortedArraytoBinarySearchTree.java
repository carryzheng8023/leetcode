package xin.carryzheng.leetcode;


import xin.carryzheng.Node;
import xin.carryzheng.Utils;

/**
 * 108
 * 题意是把一个有序数组转化为一棵二叉搜索树，二叉搜索树具有以下性质：
 *
 * 1.若任意节点的左子树不空，则左子树上所有节点的值均小于它的根节点的值；
 *
 * 2.若任意节点的右子树不空，则右子树上所有节点的值均大于它的根节点的值；
 *
 * 3.任意节点的左、右子树也分别为二叉查找树；
 *
 * 4.没有键值相等的节点。
 *
 * 所以我们可以用递归来构建一棵二叉搜索树，每次把数组分为两半，
 * 把数组中间的值作为其父节点，然后把数组的左右两部分继续构造其左右子树。
 *
 * @author zhengxin
 * @date 2018-04-04 08:53:31
 */
public class ConvertSortedArraytoBinarySearchTree {



    public static void main(String[] args){

        int[] nums = {-10, -3, 0, 5, 9};

        Node root = sortedArrayToBST(nums);

        Utils.inOrder(root);
    }

    public static Node sortedArrayToBST(int[] nums) {

        if (nums == null || nums.length == 0) return null;

        return helper(nums, 0, nums.length - 1);
    }

    private static Node helper(int[] nums, int left, int right) {

        if(left > right) return null;
        int mid = left + (right - left) / 2;

        Node node = new Node(nums[mid]);

        node.left = helper(nums, left, mid - 1);
        node.right = helper(nums, mid + 1, right);

        return node;

    }

//    private static class TreeNode{
//
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int x) {
//            val = x;
//        }
//
//        @Override
//        public String toString() {
//            return String.valueOf(this.val);
//        }
//    }
//
//    public static void preOrder(TreeNode node){
//        if (node == null) return;
//        System.out.print(node + "\t");
//        preOrder(node.left);
//        preOrder(node.right);
//    }

}
