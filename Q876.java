import java.util.*;;
public class Q876 {
    class ListNode{
        int data;
        ListNode next;
       public  ListNode(int data){
        this.data = data;
        this.next = null;
        }
    }
    public static ListNode head;
    public static ListNode tail;

    //only down part of code is need in leetcode

    public static ListNode mid() {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            if (fast.next != null) {
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }

}