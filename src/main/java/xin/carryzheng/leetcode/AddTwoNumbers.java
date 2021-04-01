package xin.carryzheng.leetcode;

/**
 * #2
 *
 * @author zhengxin
 * @date 2021-04-01 09:54:02
 */
public class AddTwoNumbers {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null)))));
        ListNode l2 = new ListNode(9, new ListNode(9, null));

//        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
//        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        ListNode l = addTwoNumbers(l1, l2);

        traverse(l);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        int carry = 0;

        while (null != l1 || null != l2) {

            int sum = 0;
            if(null != l1){
                sum += l1.val;
                l1 = l1.next;
            }
            if(null != l2){
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;

            curr.next = new ListNode(sum % 10);
            carry = sum / 10;

            curr = curr.next;

        }

        if (carry > 0 )
            curr.next = new ListNode(carry);


        return dummy.next;
    }

    static void traverse(ListNode l){

        while (null != l){
            System.out.print(l.val);
            System.out.print("\t");
            l = l.next;
        }


    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
