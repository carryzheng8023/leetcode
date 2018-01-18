package xin.carryzheng.leetcode;

/**
 * Created by zhengxin on 17/12/14.
 */
public class AddTwoNumbers {

    public static void main (String[] a){


        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1 = l1.next;
        l1.next = new ListNode(3);
        l1 = l1.next;
        System.out.println(l1.val);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2 = l2.next;
        l2.next = new ListNode(4);
        l2 = l2.next;
        System.out.println(l2.val);

        AddTwoNumbers.addTwoNumbers(l1, l2);


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l = new ListNode(0);

        return l;

    }

}


/**
 * Definition for singly-linked list.
 * */
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
