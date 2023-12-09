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


    }
}