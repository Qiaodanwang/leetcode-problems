class Solution{
	public ListNode swapPairs(ListNode head){
		if(head==null||head.next==null) return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pre = dummy;
		while(head!=null&&head.next!=null){
			ListNode sec = head.next;
			head.next = sec.next;
			sec.next = head;
			pre.next = sec;
			pre = head;
			head = head.next;
		}
		return dummy.next;
	}
}
