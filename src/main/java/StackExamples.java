import java.util.ArrayDeque;
import java.util.Deque;

public class StackExamples {

  public static void main(String[] args) {
    
    Deque<String> stack = new ArrayDeque<>();
    stack.push("First request");
    stack.push("Second request");
    stack.push("Third request");
    System.out.println(stack);
    System.out.println(stack.peek());
    stack.pop();
    System.out.println(stack);
    stack.poll();
    System.out.println(stack);



    // Replace the top number of a stack
    Deque<Integer> stack1 = new ArrayDeque<>();
    stack1.push(2);
    stack1.push(3);
    stack1.push(5);
    stack1.push(7);
    stack1.push(10);

    int newTop = 11;
    Deque<Integer> result = Answer.updateStack(stack1, newTop);
    System.out.println(result);
  }

}



class Answer {

  // Change these boolean values to control whether you see
  // the expected result and/or hints.
  static boolean showExpectedResult = false;
  static boolean showHints = false;

  // Return the same Stack as given in the input, but with the top number replaced by newTop.
  static Deque<Integer> updateStack(Deque<Integer> stack, int newTop) {
    // Your code goes here.
    stack.pop();
    stack.push(newTop);
    return stack;
  }

}
