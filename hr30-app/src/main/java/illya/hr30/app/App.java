package illya.hr30.app;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    int theNUMBER;
    int max;
    Scanner scanner = new Scanner(System.in);
  
    public App() {
      Random rand = new Random();
      max = 100;
      theNUMBER = Math.abs(rand.nextInt()) % (max + 1);
    }
  
    public void play() {
      while(true) {
        int move = scanner.nextInt();
        if (move > theNUMBER) {
          System.out.println("Your number is too big");
        } else if (move < theNUMBER) {
          System.out.println("Your number is too small");
        } else {
          System.out.println("You got it, bro!");
          break;
        }
      }
    }
   
    public static void howBigIsMyNumber(int x) {
      if (x >= 0 && x <= 10) {
        System.out.println("Our number is pretty small");
      } else if (x >= 11 && x<= 100) {
        System.out.println("Our number is pretty big");
      } else {
        System.out.println("Our number is out of range");
      }
    }
  
    public static void main (String[] args) {
      App guessGame = new App();
      System.out.println("Welcome to my game. Try an guess my impossible"
        + " number. It's between 0 and " + guessGame.max + " inclusive. "
        + " Just type a number to get started.");
      guessGame.play();
    }
  }
