package linkedlist;

class Node
{
    int data ;
    Node next;
}

public class Program1
{
    Node head ;
    void insertFirst(int value)
    {
       Node n = new Node();
       n.data = value ;
       n.next = head ;
       head = n ;
    }
    void printList ()
    {
     Node temp = head;
     while(temp != null)
     {
         System.out.println(temp.data + "\t");
         temp = temp.next;
     }
    }
    public static void main(String[] args)
    {
     Program1 p1 = new Program1();
     p1.insertFirst(10);
     p1.insertFirst(20);
     p1.insertFirst(30);
     p1.printList();

    }
}
