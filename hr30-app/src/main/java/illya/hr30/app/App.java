package illya.hr30.app;
// to run: mvn package
// followed up java -cp target/hr30-app-1.0-SNAPSHOT.jar illya.hr30.app.App

import java.util.Arrays;

public class App {

  public static void printArray(int[] array, String[] array2) {
    System.out.print("[");
    int length;
    if (array != null) {
      length = array.length;
    } else {
      length = array2.length;
    }
    
    for (int i = 0; i < length; i ++) {
      System.out.print(array != null ? array[i] : array2[i]);
      if (i < length - 1) {
        System.out.print(", ");
      }
    }
    System.out.print("]");
    System.out.println();
  }
  
  public static void main(String[] args) {
    // 3 ways to initialize arrays in Java
    // NOTE: all arrays elements must be of SAME data-type!
    // NOTE2: cannot process (print, etc) arrays that have not been initialized!
    // For example, int[] intArray1 is declared, but cannot be printed
    // 1

    // MODULO and the array index
    // Array: [0, 1, 2, 3, 4]  ---> length == 5
    // Math.abs(rand.nextInt()) % 5 ---> will always be either 0, 1, 2, 3, or 4
    // Random objects from an array:
    // Math.abs(rand.nextInt()) % array.length;

    // DECLARING, ALLOCATING, and INITIALIZING
    int[] intArray1;
    // 2 (an array of integers with size 4)
    int[] intArray2 = new int[4];
    // 3
    int[] intArray3 = {5, 2, 9, 1, 3};

    //GIVEN FUNCTIONS:
    Arrays.sort(intArray3);
    // printArray(intArray3, null);

    String[] shoppingList = {"bananas", "apples", "pears"};

    intArray2[0] = 10;
    intArray2[1] = 8;
    intArray2[2] = 5;
    intArray2[3] = 10;

    // System.out.println("Hello");
    // printArray(intArray2, null);
    // printArray(null, shoppingList);

    //SPECIAL FOR LOOP:
    //"for each" loop which DOES NOT guarantee in-order traversal
    System.out.println("Special for loop");
    for (String s : shoppingList) {
      System.out.println(s);
    }

  }
}
