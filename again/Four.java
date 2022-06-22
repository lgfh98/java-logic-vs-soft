package again;

import java.util.HashMap;

public class Four {
  public static void main(String[] args) {

    int[] myArray = { 1, 2, 2, 5, 4, 66, 7, 8, 8, 8, 1, 65, 3, 4, 6, 7, 66, 66, 2, 5, 34, 5, 46, 66, 66, 66, 345345, 66,
        66, 66, 66, 3453, 34, 5, 3, 76, 8, 2, 14, 5, 66, 66, 66, 66, 66, 66, 66, 23, 6, 7, 2, 4, 5, 7, 245, 7, };
    mostNumberOccurrences(myArray);
  }

  public static void mostNumberOccurrences(int[] numbers) {
    HashMap<Integer, Integer> counterMap = new HashMap<>();
    int maxRepetitions = 0;
    int resNumber = 0;
    for (int i = 0; i < numbers.length; i++) {
      int key = numbers[i];
      if (counterMap.get(key) != null) {
        counterMap.put(key, counterMap.get(key) + 1);
        if (counterMap.get(key).compareTo(maxRepetitions) == 1) {
          maxRepetitions = counterMap.get(key);
          resNumber = key;
        }
      } else {
        counterMap.put(key, 1);
      }
    }
    System.out.println("Longest:" + maxRepetitions);
    System.out.println("Number:" + resNumber);
  }
}
