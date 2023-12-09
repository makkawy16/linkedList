public class LinkedList {
    private Node head;
    private Node tail;
    private Node prev;
    private int length;
    private Node lastItem;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
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

    //add new node in the end
    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
            lastItem = newNode;
            prev = newNode;
        } else {
            prev = tail;
            tail.next = newNode; // el sahm aly byshawer 3la el new node
            tail = newNode; // tail ra7 3la al new node
            lastItem = newNode;
        }
        length++;
    }

    //add new node as first node
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;

    }

    //remove first node
    public void removeFirstNode(){
        if(length == 0) System.out.println("list is empty");
        /*else if(length == 1) {
            head = null;
            tail = null;
            length =0;
            System.out.println("list now is empty");
        }*/
        else{
            Node temp = head;
            head = head.next;
            temp = null;
            length--;
            if (length == 0) {
                tail = null;
                System.out.println("list now is empty");
            }
        }
    }

    //remove last node
    public void removeLast() {
        if (length == 0) System.out.println("list is null");
        else {

            if (tail != head) {
                tail = prev;
                tail.next = null;
                length--;
            } else {
                tail = null;
                head = null;
                length = 0;
                System.out.println("list is now empty");
            }

        }
    }

    public int getBeforeLastItem() {
        return prev.value;
    }

    public int getLastItem() {
        return lastItem.value;
    }

    class Node {
        int value;
        Node next;


        public Node(int value) {
            this.value = value;
        }
    }
}
