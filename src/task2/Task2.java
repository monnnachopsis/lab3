package task2;

class Node {
    public int value;
    public Node next;
    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }}


public class Task2 {
    public static void wTail(){
        Node head=new Node(0, null);
        Node tail=head;
        for (int i = 0; i <9; i++) {
            tail.next=new Node(i+1, null);
            tail=tail.next;
        }
        // вывод элементов на экран
        Node ref = head; //
        System.out.println("вывод элементов наращенных с хвоста:");
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
    public static void wHead(){
        Node head=null;
        for (int i =9; i>=0; i--) {
            head=new Node(i, head);
        }
        // вывод элементов на экран
        Node ref = head;
        System.out.println("вывод элементов наращенных с головы:");
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }

    }
    public static void main(String[] args) {
        wTail();
        System.out.println(" ");
        wHead();
    }
}
