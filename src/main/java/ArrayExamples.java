import java.util.Arrays;

public class ArrayExamples {

  public static void main(String[] args) {

    String[] weekdays = new String[7];
    System.out.println(Arrays.toString(weekdays));

    weekdays[0] = "Monday";
    System.out.println(Arrays.toString(weekdays));

    weekdays = new String[]{"Mon", "Tue", "Wed"};
    System.out.println(Arrays.toString(weekdays));

    for(String day : weekdays) {
      System.out.println("Week day: " + day);
    }

    for(int i = 0; i < weekdays.length; i++) {
      weekdays[i] = weekdays[i].toUpperCase();
    }
    System.out.println(Arrays.toString(weekdays));




    // Test the incrementArray method
    int[] numbers = {1, 2, 3, 4, 5};
    int[] incrementedNumbers = IncrementArrays.incrementArray(numbers);

    // Print the incremented array
    for (int number : incrementedNumbers) {
      System.out.print(number + " ");
    }
  }

}

class IncrementArrays {
  // Change these boolean values to control whether you see
  // the expected result and/or hints.
  static boolean showExpectedResult = true;
  static boolean showHints = true;

  // Increment each number in the 'numbers' array by one
  static int[] incrementArray(int[] numbers) {
    int[] result = new int[numbers.length];

    for(int i = 0; i < numbers.length; i++){
      result[i] = numbers[i] + 1;
      //numbers = new int[numbers.length];
    }
    return result;
    //return new int[numbers.length];
  }
}