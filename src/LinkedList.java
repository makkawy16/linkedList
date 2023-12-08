public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length=1;
    }
    public int getHead() {
        return head.value;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);

        if(length ==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode; // el sahm aly byshawer 3la el new node
            tail = newNode; // tail ra7 3la al new node
        }
        length++;
    }
    class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
