public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head,fast=head;
        if(head==null ||head.next==null)
            return false;
        if(head.next==head) return true;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
                return true;
        }
      return false;
    }
}
