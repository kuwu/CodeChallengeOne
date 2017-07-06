import java.util.Scanner;

/**
 * Created by Richard Ren and Kurt Wunderlich on 2017/07/06.
 */
public class TwoDArray {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int input;

    int[][] twoD = new int[3][3];


    for (int i = 0; i < twoD.length; i++) {
      for (int j = 0; j < twoD[i].length; j++) {
        System.out.print("\u001B[36m" + "Enter the a whole number:  " + "\u001B[0m");
        input = scan.nextInt();
        twoD[i][j] = input;

      }

    }
    int sum = 0;

    for (int i = 0; i < twoD.length; i++) {
      for (int j = 0; j < twoD[i].length; j++) {
        //System.out.print(twoD[i][j] + " ");
        if ((i == 1) && (j == 0 || j == 2));
        else sum += twoD[i][j];
      }
    }

    System.out.println("\u001B[33m" + "Sum of hourglass in grid 3 x 3 array: "+ "\u001B[0m" + sum);

  }

}


