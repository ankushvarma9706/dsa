package queue;

import java.util.ArrayDeque;

public class Program3
{
    public static void main(String[] args)
    {
        ArrayDeque<String>a1 = new ArrayDeque<>() ;
        a1.add("James" );
        a1.add("Peter" );
        a1.add("Albart" );
        a1.addFirst("Marry");
        a1.addLast("Pooja");
        System.out.println(a1.getFirst());
        System.out.println(a1.getLast());
        System.out.println(a1);
        System.out.println(a1.remove("Pooja"));
        System.out.println(a1.removeFirst());
        System.out.println(a1.removeLast());



    }
}
