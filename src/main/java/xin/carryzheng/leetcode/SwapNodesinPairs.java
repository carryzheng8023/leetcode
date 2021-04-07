package xin.carryzheng.leetcode;

import xin.carryzheng.utils.ListNode;

import static xin.carryzheng.utils.Utils.traverse;

/**
 *
 * #24
 *
 * @author zhengxin
 * @date 2021-04-07 21:07:19
 */
public class SwapNodesinPairs {

    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null))))));

        traverse(new SwapNodesinPairs().swapPairs(head));

    }


    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode();

        dummy.next = head;

        ListNode curr = dummy;

        while (curr.next != null && curr.next.next != null){
            ListNode n1 = curr.next;
            ListNode n2 = curr.next.next;
            curr.next = n2;
            n1.next = n2.next;
            n2.next = n1;
            curr = n1;
        }

        return dummy.next;

    }

}
