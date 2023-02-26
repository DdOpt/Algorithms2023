package chapter_array_linkedlist;

/**
 * @author weizheng ma
 * @email 15101093126@163.com
 * @date 2023/2/25 18:38
 **/

public class linked_list {
    //在结点n0之后插入结点p
    static void insert(ListNode n0,ListNode p){
        p.next = n0.next;
        n0.next = p;
    }
    //删除结点n0之后的首个结点
    static void remove(ListNode n0){
        if (n0.next == null)
            return;
        n0.next = n0.next.next;
    }

    //访问索引为index的结点
    static ListNode access(ListNode head, int index){
        for(int i = 0;i < index;i++){
            if(head == null)
                return null;
            head = head.next;
        }
        return head;
    }

    //访问首个值为target的结点
    static int find(ListNode head,int target){
        int index = 0;
        while(head != null){
            if (head.val == target)
                return index;
            head = head.next;
            ++index;
        }
        return -1;
    }

    public static void main(String[] args) {
        ListNode n0 = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);

        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        //n4.next = null;
        //System.out.println("初始化链表为：");

        System.out.println("n0的下一个结点的值"+n0.next.val);
        insert(n0,new ListNode(10));
        System.out.println("n0的下一个结点的值"+n0.next.val);

        //删除结点
        remove(n0);
        System.out.println("n0的下一个结点的值"+n0.next.val);

        //访问结点
        int index = 2;
        ListNode node = access(n0,index);
        System.out.println("索引为"+index+"的结点的值为"+node.val);

        //查找结点
        int idx = find(n0,4);
        System.out.println("值为4的首个结点的索引为"+idx);


    }

}

/* 链表结点类 */
class ListNode {
    int val;        // 结点值
    ListNode next;  // 指向下一结点的指针（引用）
    ListNode(int x) { val = x; }  // 构造函数
}
