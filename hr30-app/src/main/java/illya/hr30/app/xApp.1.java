/*
package illya.hr30.app;
// to run: mvn package
// followed up java -cp target/hr30-app-1.0-SNAPSHOT.jar illya.hr30.app.App

import java.util.HashMap;
import java.util.Map;

public class App {
  public static void main(String[] args) {
    // English to Spanish Dictionary
    Map<String,String> englSpanDictionary = new HashMap<String, String>();

    // putting this inside our dictionary
    englSpanDictionary.put("Monday", "Lunes");
    englSpanDictionary.put("Tuesday", "Martes");
    englSpanDictionary.put("Wednesday", "Miércoles");
    englSpanDictionary.put("Thursday", "Jueves");
    englSpanDictionary.put("Friday", "Viernes");
    englSpanDictionary.put("Saturday", "Sábado");
    englSpanDictionary.put("Sunday", "Domingo");

    // Retrieve things from our dictionary
    System.out.println(englSpanDictionary.get("Monday"));
    System.out.println(englSpanDictionary.get("Tuesday"));
    System.out.println(englSpanDictionary.get("Wednesday"));
    System.out.println(englSpanDictionary.get("Thursday"));
    System.out.println(englSpanDictionary.get("Friday"));

    // print all the keys
    System.out.println(englSpanDictionary.keySet());
    // print all the values
    System.out.println(englSpanDictionary.values());
    // print out size
    System.out.println("The size of our dictionary is " + englSpanDictionary.size());
    System.out.println();
    System.out.println();

    // Shopping list
    Map<String,Boolean> shoppingList = new HashMap<String, Boolean>();

    shoppingList.put("Ham", true);
    shoppingList.put("Bread", Boolean.TRUE);
    shoppingList.put("Oreos", Boolean.TRUE);
    shoppingList.put("Eggs", Boolean.FALSE);
    shoppingList.put("Butter", false);

    // Retrieve things from our dictionary
    System.out.println(shoppingList.get("Ham"));
    System.out.println(shoppingList.get("Bread"));
    System.out.println(shoppingList.get("Oreos"));
    System.out.println(shoppingList.get("Eggs"));
    System.out.println(shoppingList.get("Butter"));

    // print all the keys
    System.out.println(shoppingList.keySet());
    // print all the values
    System.out.println(shoppingList.values());
    // print out size
    System.out.println("The size of our dictionary is " + shoppingList.size());
    // check whether the dictionary is empty
    System.out.println("Is empty? " + shoppingList.isEmpty());
    // print out KV pairs
    System.out.println(shoppingList.toString());
    // remove k-v pair
    shoppingList.remove("Eggs");
    // replace values for existing keys
    shoppingList.replace("Bread", Boolean.FALSE);

    System.out.println(shoppingList.toString());

    // clear the dectionary
    // NOTE: this does not remove values in memory, but simply
    // changes the pointers around
    shoppingList.clear();

    System.out.println("Is empty? " + shoppingList.isEmpty());

    System.out.println();
    System.out.println();
  }
}
*/