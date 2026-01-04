class Solution {
    int getMiddle(Node head) {
        // Initialize slow and fast pointers
        Node slow = head;
        Node fast = head;

        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow will be pointing to the middle node
        return slow.data;
    }
}
