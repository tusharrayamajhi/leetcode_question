import java.util.PrimitiveIterator.OfDouble;

public class Q876 {

    public class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode head;
    public static  ListNode tail;

    public  void add(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;


    }
    
    public  static ListNode mid(){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null){
            if(fast.next != null){
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }
    public void print(ListNode mid){
        ListNode temp = mid;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Q876 ll = new Q876();
        ll.add(5);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);
        ListNode mid = mid();
        ll.print(mid);
       // System.out.println(ll.mid());

    }
}