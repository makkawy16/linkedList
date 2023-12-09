public class Main {
    public static void main(String[] args) {

    /* LinkedList linkedList =new LinkedList(4);
        System.out.println( linkedList.getHead());
        System.out.println( linkedList.getTail());
        System.out.println( linkedList.getLength());

        linkedList.printList();*/


        LinkedList linkedList = new LinkedList(2);
        // linkedList.append(3);
        // linkedList.append(4);
        linkedList.printList();


        //  System.out.println("last item : " + linkedList.getLastitem());
        //  System.out.println("before last :" + linkedList.beforeLast());
        // System.out.println("length : " + linkedList.getLength());


        linkedList.removeLast();
        System.out.println("after remove");
        linkedList.printList();
        // System.out.println("length : " + linkedList.getLength());


        //add item in empty list
        linkedList.prepend(5);
        linkedList.printList();

        System.out.println("add node in the first");

        //add item in the first
        linkedList.prepend(6);
        linkedList.printList();

        System.out.println("remove first node");
        linkedList.removeFirstNode();
        linkedList.printList();

        System.out.println("remove first node again");
        linkedList.removeFirstNode();
        linkedList.printList();

        linkedList.append(3);
        linkedList.append(4);

        linkedList.printList();
        System.out.println("node by index");

        //get item using index
        try {
            System.out.println(linkedList.get(1).value);
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage() );
        }

        // change value of a node using index
        linkedList.set(0,3);
        linkedList.append(6);
        linkedList.append(7);

        System.out.println("the list : ");
        linkedList.printList();

        System.out.println("insert new node");
        linkedList.insert(3,8);

    }
}