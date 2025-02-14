#Print a linked list
class Solution {
    // Function to display the elements of a linked list in the same line
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
