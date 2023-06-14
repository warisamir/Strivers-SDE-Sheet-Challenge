class Solution {
    public ListNode reverse(ListNode start,ListNode end){
        ListNode prev=start;
        ListNode curr=start.next,first=curr;
        while(curr!=end){
             ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        start.next=prev;
         first.next=curr;
        return first;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null|| head.next==null)return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode start=dummy;
        ListNode last=head;
        int ct=0;
        while(last!=null){
           ct++;
               if(ct%k==0){
                   start=reverse(start,last.next);
                   last=start.next;
               }
            else
            last=last.next;
        }
        return dummy.next;
    }

}
