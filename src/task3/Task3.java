package task3;

class Node {
    public int value;
    public Node next;
    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }}


public class Task3 {
    static Node headR;
    static int b=0;
    public static Node createTail(){
        Node head=new Node(0, null);
        Node tail=head;
        for (int i = 0; i <9; i++) {
            tail.next=new Node(i+1, null);
            tail=tail.next;
        }
        return head;
    }
    public static Node createHead(){
        Node head=null;
        for (int i =9; i>=0; i--) {
            head=new Node(i, head);
        }
        return head;
    }
    public static void ToString(Node head){
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
    public static Node AddFirst(Node head){
        head = new Node(77, head);
        return head;
    }
    public static Node AddLast(Node head){
        Node newtail=new Node(123, null);
        Node ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next=newtail;
        return head;
    }
    public static Node Insert(Node head){
        Node newNode=new Node(44, null);
        Node ref = head;
        int k=1;
        while (ref.next!= null && (k<2 )) {
            ref = ref.next;
            k++;
        }
        newNode.next=ref.next.next;
        ref.next=newNode;
        return head;
    }
    public static Node RemoveFirst(Node head){
        head=head.next;
        return head;
    }
    public static Node RemoveLast(Node head){
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next=null;
        return head;
    }
    public static Node Remove(Node head){
        Node ref = head;
        int k=1;
        while (ref.next!= null && (k<2 )) {
            ref = ref.next;
            k++;
        }
        ref.next=ref.next.next;
        return head;
    }
    public static void createHeadRec(int i, Node ref){
        if(i>=0){
            Node head = new Node(i, ref);
            createHeadRec(--i,head);
        } else{
            headR = ref;
        }
    }
    public static void createTailRec(int i, Node ref){
        Node head = new Node(0,null);
        if(b<=i){
            Node tail=new Node(b+1,null);
            createTailRec(++b, tail);
        }
    }
    public static void toStringRec(Node head){
        Node ref = head;
        if(ref!=null){
            System.out.println(" "+ref.value);
            toStringRec(head);
        }
    }
    public static void main(String[] args) {
        createHeadRec(5, null);
    }
}
