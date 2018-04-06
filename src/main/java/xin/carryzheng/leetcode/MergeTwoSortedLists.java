package xin.carryzheng.leetcode;

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

        Node head1 = new Node(1, new Node(2, new Node(4)));

        Node head2 = new Node(1, new Node(3, new Node(4)));

        traverse(mergeTwoLists(head1, head2));

    }


    private static class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node(int data, Node node){
            this.data = data;
            this.next = node;
        }

    }

    private static Node mergeTwoLists(Node l1, Node l2) {

        Node head = new Node(0);
        Node temp = head;

        while (l1 != null && l2 != null){

            if(l1.data < l2.data){
                temp.next = l1;
                l1 = l1.next;
            }else {
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;

        }

        temp.next = l1 != null ? l1 : l2;

        return head.next;


    }

    private static void traverse(Node head){

        for (; head != null; head = head.next){
            System.out.print(head.data + "\t");
        }

    }

}
