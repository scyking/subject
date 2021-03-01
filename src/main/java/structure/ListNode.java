package structure;

/**
 * 链表数据结构
 */
public class ListNode {

    private int val;
    private ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode next(int val){
        this.next = new ListNode(val);
        return this.next;
    }

    public int getVal() {
        return val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode node){
        this.next = node;
    }
}
