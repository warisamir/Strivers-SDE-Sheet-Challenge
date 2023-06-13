class Solution {
    int carry=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     if(l1==null && l2==null && carry==0)
         return null;
        int d1=l1==null?0:l1.val;
        int d2=l2==null?0:l2.val;
        int sum=d1+d2+carry;
        carry=sum/10;
        l1=(l1==null)? null:l1.next;
        l2=(l2==null)? null:l2.next;
         ListNode res=new ListNode(sum%10,addTwoNumbers(l1,l2));
        return res;
    }
}
