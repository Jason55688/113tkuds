
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Question6 {
    // 反向列印鏈結串列所有元素（遞迴）
    public static void printReverse(ListNode head) {
        if (head == null) return;
        printReverse(head.next);
        System.out.print(head.val + " ");
    }

    public static void main(String[] args) {
        // 建立範例鏈結串列：1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        // 反向列印
        System.out.print("Reverse: ");
        printReverse(head);
        System.out.println();
    }
}
