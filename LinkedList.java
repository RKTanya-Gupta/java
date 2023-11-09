class LinkedList{
    public static void main(String args[])
    {
        node<Integer> n1 = new node<Integer>(10);
        node<Integer> n2 = new node<Integer>(20);
        node<Integer> n3 = new node<Integer>(30);
        node<Integer> n4 = new node<Integer>(40);
        node<Integer> n5 = new node<Integer>(50);
        n1.address = n2;
        n2.address = n3;
        n3.address = n4;
        n4.address = n5;
        // first way to print linked list---------------------
        // System.out.println(head.data);
        // System.out.println(head.address.data);
        // System.out.println(head.address.address.data);
        // System.out.println(head.address.address.address.data);
        // System.out.println(head.address.address.address.address.data);
        // another way to print linked list-------------------
        // node<Integer> head = n1;
        // while(head != null)
        // {
        //     System.out.println(head.data);
        //     head = head.address;
        // }

    }
}