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
    public void removeFirstNode() {
        if (length == 0) System.out.println("list is empty");
        /*else if(length == 1) {
            head = null;
            tail = null;
            length =0;
            System.out.println("list now is empty");
        }*/
        else {
            Node temp = head;
            head = head.next;
            temp = null;
            length--;
            printList();
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
                printList();
            } else {
                tail = null;
                head = null;
                length = 0;
                System.out.println("list is now empty");
            }

        }
    }

    //get node by index
    public Node get(int index) {
        if (length == 0 || index < 0 || index > length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++)
            temp = temp.next;
        return temp;


        //another way but longer
        /*else if (index == 0)
            return head;
        else if (index == length-1)
            return tail;
        else {
            while (index < length){
                 temp = head.next;
                index ++;
            }
            return temp;
        }*/
    }

    //change a node value using index
    public void set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            System.out.println("set success");
            printList();
        } else
            System.out.println("out of range");
    }

    //insert new node using index
    public void insert(int index, int value) {
        if (index < 0 || index > length) System.out.println("Out Of Range");
        else if (index == 0) prepend(value);
        else if (index == length) append(value);
        else {
            Node newNode = new Node(value);
            Node temp = get(index - 1);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
        }
        printList();
    }

    //remove node
    public void remove(int index) {
        if (index < 0 || index >= length) System.out.println("Out Of Range");
        else if (index == 0) removeFirstNode();
        else if (index == length - 1) removeLast();
        else {
            Node prev = get(index - 1);
            Node temp = prev.next;
            prev.next = temp.next;
            temp.next = null;
            length--;
            printList();

        }
    }

    //reverse
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;

        }
        printList();
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
