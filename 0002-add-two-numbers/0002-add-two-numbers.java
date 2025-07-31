/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addRecursive(l1,l2,0);
        
    }
    private ListNode addRecursive(ListNode l1, ListNode l2, int carry) {
        if(l1 == null && l2 == null && carry == 0) {
            return null;
        }
        int sum = carry;

        if(l1 != null){
            sum += l1.val;
            l1 = l1.next;
        }
        if(l2 != null) {
            sum += l2.val;
            l2 = l2.next;
        }
        ListNode newNode = new ListNode(sum % 10);
        newNode.next  = addRecursive(l1,l2,sum/10);

        return newNode;
    }
    public static ListNode createList(int[] values) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + (head.next != null  ? "  -> " : ""));
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode l1 = createList(new int[]{2, 4, 3});
        ListNode l2 = createList(new int[]{5, 6, 4});
        ListNode result = sol.addTwoNumbers(l1, l2);
        System.out.print("Output: ");
        printList(result); // Output: 7 -> 0 -> 8

        l1 = createList(new int[]{0});
        l2 = createList(new int[]{0});
        result = sol.addTwoNumbers(l1, l2);
        System.out.print("Output: ");
        printList(result); // Output: 0

        l1 = createList(new int[]{9, 9, 9, 9, 9, 9, 9});
        l2 = createList(new int[]{9, 9, 9, 9});
        result = sol.addTwoNumbers(l1, l2);
        System.out.print("Output: ");
        printList(result); 
    }
}