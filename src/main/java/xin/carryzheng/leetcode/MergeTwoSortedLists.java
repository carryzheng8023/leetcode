package xin.carryzheng.leetcode;

import xin.carryzheng.utils.ListNode;

import static xin.carryzheng.utils.Utils.traverse;

/**
 * #21
 * 题意是用一个新链表来合并两个已排序的链表，
 * 那我们只需要从头开始比较已排序的两个链表，新链表指针每次指向值小的节点，依次比较下去，
 * 最后，当其中一个链表到达了末尾，我们只需要把新链表指针指向另一个没有到末尾的链表此时的指针即可。
 *
 * @author zhengxin
 * @date 2018-03-19 14:56:54
 */
public class MergeTwoSortedLists {

    public static void main(String[] args){

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));

        traverse(new MergeTwoSortedLists().mergeTwoLists(l1, l2));

    }



    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode();
        ListNode t = dummy;

        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                t.next = l1;
                l1 = l1.next;
            }else {
                t.next = l2;
                l2 = l2.next;
            }
            t = t.next;

        }

        t.next = l1 != null ? l1 : l2;

        return dummy.next;

    }

}
