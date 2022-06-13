/**
 * MaxNumber
 */
public class MaxNumber {

  public static void main(String[] args) {
    int[] numbers = { 12, 32, 53, 32, 53, 12, 93, 44, 26 };
    maxNumber(numbers);
  }

  public static void maxNumber(int[] numbers) {
    int max = 0;
    for (int i = 0; i < numbers.length; i++) {
      int element = numbers[i];
      if (element > max) {
        max = element;
      }
    }
    System.out.println(max);
  }
}