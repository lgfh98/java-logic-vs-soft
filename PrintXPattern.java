public class PrintXPattern {
  public static void main(String[] args) {
    printXPattern(6);
  }

  public static void printXPattern(int n) {

    if (n <= 0) {
      System.out.println("ERROR");
      return;
    }

    String[][] matrix = new String[n][n];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = matrix[0].length - 1; j >= 0; j--) {
        matrix[i][j] = "_";
      }
    }

    int i = 0;
    int j = matrix.length - 1;
    int k = 0;

    while (k < matrix.length) {
      matrix[k][i] = "X";
      matrix[k][j] = "X";
      k++;
      i++;
      j--;
    }

    printMatrix(matrix);

  }

  public static void printMatrix(String[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      System.out.println();
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j]);
      }
    }

  }
}
