package illya.hr30.app;
// to run: mvn package
// followed up java -cp target/hr30-app-1.0-SNAPSHOT.jar illya.hr30.app.App

public class App {

  public static int Summation(int n) {
    // Base case:
    if (n <=0) {
      return 0; // additive identity property --> 3 + 2 + 1 + 0
    } else {
      // Recursive case:
      return n + Summation(n - 1);
    }
  }

  public static int Factorial(int n) {
    if (n <= 1) {
      return 1; // multiplicative identity property --> 3 * 2 * 1
    } else {
      return n * Factorial(n - 1);
    }
  }

  public static int Exponentiation(int n, int m) {
    if (m == 0) {
      return 1;
    } else if (m == 1) {
      return n;
    } else {
      return n * Exponentiation(n, m - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println("The summation from 3 to 0 is: " + Summation(3));
    System.out.println("6 factorial is " + Factorial(6));
    System.out.println("2 cubed is " + Exponentiation(2, 3));
    System.out.println("4 to the 4th " + Exponentiation(4, 4));
  }
}
