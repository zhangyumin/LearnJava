package algorithm.MergeSortedLinkedList;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by joker on 16-9-3.
 */
public class MergeSortedLinkedList {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = null;
        if(list1 == null){
            return list2;
        }
        if(list1 == null){
            return list1;
        }
        if(list1.val > list2.val){
            head = list2;
            head.next = Merge(list1, list2.next);
        }
        else{
            head = list1;
            head.next = Merge(list1.next, list2);
        }

        return head;
    }

    public static void main(String[] args) {
        MergeSortedLinkedList t = new MergeSortedLinkedList();
        ListNode head = t.new ListNode(1);
        ListNode current = head;
        current.next = t.new ListNode(3);
        current = current.next;
        current.next = t.new ListNode(5);
        current = current.next;
        current.next = t.new ListNode(7);

        ListNode head2 = t.new ListNode(2);
        current = head2;
        current.next = t.new ListNode(4);
        current = current.next;
        current.next = t.new ListNode(6);
        current = current.next;
        current.next = t.new ListNode(8);

        ListNode ln = t.Merge(head, head2);
        System.out.println(ln);
    }
}
