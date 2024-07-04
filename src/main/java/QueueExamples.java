import java.util.*;

public class QueueExamples {

  public static void main(String[] args) {

    Queue<String> queue = new ArrayDeque<>();
    //Queue<String> queue = new LinkedList<>();
    queue.offer("Person One");
    queue.offer("Person Two");
    queue.offer("Person Three");
    System.out.println(queue);
    System.out.println(queue.peek());
    queue.poll();
    System.out.println(queue + "\n\n");

    Queue<String> queue1 = new PriorityQueue<>();
    queue1.offer("Person One");
    queue1.offer("Person Two");
    queue1.offer("Person Three");
    System.out.println(queue1);
    System.out.println(queue1.peek());
    queue1.poll();
    System.out.println(queue1);


    // Shorten a Queue
    Queue<Integer> queueCopy = new ArrayDeque<>(Arrays.asList(1, 93, -13, 6, 105));
    //Queue<Integer> queueCopy = new ArrayDeque<>(queue);
    Queue<Integer> result = Answer.shortenQueue(queueCopy);
    System.out.println(result);
  }

}



class Answer {


  // Change these boolean values to control whether you see
  // the expected result and/or hints.
  static boolean showExpectedResult = false;
  static boolean showHints = false;

  // Return the same ArrayDeque given as input, but with the first 3 numbers removed from the front.
  static Queue<Integer> shortenQueue(Queue<Integer> queue) {
    // Your code goes here.
    int count = 0;
    for(int i = 0; i < queue.size(); i++){
      queue.poll();
      count++;
      if(count == 3){
        break;
      }
    }
    return queue;
  }

}
