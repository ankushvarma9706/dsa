package Stack;

import java.util.Stack;

public class Program2 {
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<>();
        stack.push("James");
        stack.push("Peter");
        stack.push("Albert");
        System.out.println(stack);

        System.out.println("Poped out Element :"+stack.pop());

        System.out.println(stack);
        System.out.println("TOp Element :"+stack.peek());
    }
}
