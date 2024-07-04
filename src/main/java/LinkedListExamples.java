import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class LinkedListExamples {

  public static void main(String[] args) {

    LinkedList<String> shoppingList = new LinkedList<>();
    shoppingList.add("apple");
    shoppingList.add("banana");
    shoppingList.add("pear");
    System.out.println(shoppingList);

    shoppingList.add(1, "mango");
    System.out.println(shoppingList);

    shoppingList.removeFirst();
    System.out.println(shoppingList);

    List<String> synchronizedShoppingList = Collections.synchronizedList(shoppingList);
    System.out.println(synchronizedShoppingList);



    // add an item at given position in a linked list
    LinkedList<String> words = new LinkedList<>(Arrays.asList("Mercury", "Venus", "Mars"));
    //LinkedList<String> wordsCopy = new LinkedList<>(words);
    String newWord = "Earth";
    int index = 2;
    LinkedList<String> result = Answer.updateLinkedList(words, newWord, index);
    System.out.println(result);
  }

}


class Answer {

  // Change these boolean values to control whether you see
  // the expected result and/or hints.
  static boolean showExpectedResult = false;
  static boolean showHints = false;

  // Add the newWord to the words list at the given index
  static LinkedList<String> updateLinkedList(LinkedList<String> words, String newWord, int index) {
    // Your code goes here.
    words.add(index, newWord);
    return words;
  }

}
