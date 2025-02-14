class Solution {
    public ListNode sortList(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        int[] listarray = new int[len];
        int i = 0;
        ListNode newtemp = head;
        while(newtemp != null){
            listarray[i] = newtemp.val;
            i++;
            newtemp = newtemp.next;
        }
        Arrays.sort(listarray);
        ListNode temp2 = head;
        int j = 0;
        while(temp2 != null){
            temp2.val = listarray[j];
            j++;
            temp2 = temp2.next;
        }
        return head;
    }
}
