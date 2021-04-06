package xin.carryzheng.leetcode;

import xin.carryzheng.utils.ListNode;
import xin.carryzheng.utils.Utils;

/**
 * #15
 *
 * @author zhengxin
 * @date 2021-04-06 14:24:24
 */
public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        ListNode result = new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 2);

        Utils.traverse(result);

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode n1 = dummy;
        ListNode n2 = dummy;

        for (int i=0; i<=n; i++){
            n2 = n2.next;
        }

        while (n2 != null) {
            n1 = n1.next;
            n2 = n2.next;
        }

        n1.next = n1.next.next;

        return dummy.next;



    }


}


