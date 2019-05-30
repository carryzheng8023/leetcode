package xin.carryzheng.leetcode;


/**
 * #203
 * <p>
 * 删除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例:
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 *
 * @author zhengxin
 * @date 2019-05-30 14:37:50
 */
public class RemoveLinkedListElements {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        ListNode(int[] arr) {
            if(arr == null || arr.length == 0)
                throw new IllegalArgumentException("数组不能为空！");

            this.val = arr[0];

            ListNode cur = this;
            for (int i=1; i<arr.length; i++){
                cur.next = new ListNode(arr[i]);
                cur = cur.next;
            }

        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode cur = this;
            while (cur != null){
                sb.append(cur.val).append("->");
                cur = cur.next;
            }

            sb.append("NULL");

            return sb.toString();
        }
    }

    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val)
            head = head.next;

        if (head == null)
            return null;

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val)
                prev.next = prev.next.next;
            else
                prev = prev.next;
        }

        return head;
    }

    public ListNode removeElements2(ListNode head, int val) {

        ListNode dummyHead = new ListNode(-1);

        dummyHead.next = head;

        ListNode prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.val == val)
                prev.next = prev.next.next;
            else
                prev = prev.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};

        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = new RemoveLinkedListElements().removeElements(head, 6);
        System.out.println(res);
        ListNode res2 = new RemoveLinkedListElements().removeElements2(head, 6);
        System.out.println(res2);
    }


}
