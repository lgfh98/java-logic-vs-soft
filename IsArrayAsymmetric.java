/**
 * IsArrayAsymmetric
 */
public class IsArrayAsymmetric {

  public static void main(String[] args) {
    System.out.println(1 / 2);/// ?????
    String[] array = { "a", "b", "c", "d", "asdasdasd", "c", "b", "a" };
    isArrayAsymmetric(array);
  }

  public static void isArrayAsymmetric(String[] array) {

    boolean symmetric = true;
    for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
      if (!array[i].equals(array[j])) {
        symmetric = false;
        break;
      }
    }
    System.out.println("Is the array asymetric? " + !symmetric);
  }
}