import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class TreeSetExamples {

  public static void main(String[] args) {

    Set<Integer> treeSet = new TreeSet<>();
    treeSet.add(1);
    treeSet.add(300);
    treeSet.add(47);
    treeSet.add(6);
    System.out.println(treeSet);
    treeSet.add(6);
    System.out.println(treeSet);

    Set<String> wordSet = new TreeSet<>(Comparator.comparing(String::length));
    wordSet.add("tiger");
    wordSet.add("giraffe");
    wordSet.add("bear");
    System.out.println(wordSet);
    wordSet.add("wolf"); // when comparing by length, it sees wolf as a duplicate therefore, will not add it
    System.out.println(wordSet);
    wordSet.remove("giraffe");
    System.out.println(wordSet);



    // Add the given strings to a treeSet and order by length
    String word1 = "red";
    String word2 = "yellow";
    String word3 = "blue";

    TreeSet<String> result = Answer.createSortedTreeSet(word1, word2, word3);
    System.out.println(result);

    TreeSet<String> result1 = Answer.createSortedTreeSet1(word1, word2, word3);
    System.out.println(result1);
  }

}



class Answer {

  // Change these boolean values to control whether you see
  // the expected result and/or hints.
  static boolean showExpectedResult = true;
  static boolean showHints = true;

  // Return a TreeSet containing the three words, ordered by length.
  static TreeSet<String> createSortedTreeSet(String word1, String word2, String word3) {
    // Your code goes here.
    TreeSet<String> lengthSet = new TreeSet<>(Comparator.comparing(String::length));
    lengthSet.add(word1);
    lengthSet.add(word2);
    lengthSet.add(word3);

    return lengthSet;

    //return new TreeSet<>(lengthSet.);
  }

  static TreeSet<String> createSortedTreeSet1(String word1, String word2, String word3) {
    TreeSet<String> set = new TreeSet<>(Comparator.comparing(String::length));
    set.addAll(Arrays.asList(word1, word2, word3));
    return set;

  }

}