package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {
    public static void main(String[] args) {
        //English to Spanish Dictionary
        Map<String,String> englSpansDictionary = new HashMap<String, String>();
        //putting things inside our dictionary.
        englSpansDictionary.put("Monday","Lunes");
        englSpansDictionary.put("Tuesday","Martes");
        englSpansDictionary.put("Wednesday", "Miércoles");
        englSpansDictionary.put("Thrusday", "Jueves");
        englSpansDictionary.put("Friday", "Vieranes");
        englSpansDictionary.put("Saturday", "Sábado");
        englSpansDictionary.put("Sunday", "Domingo");


        //These shall only give out the values.
        System.out.println(englSpansDictionary.get("Monday"));
        System.out.println(englSpansDictionary.get("Wednesday"));

        //These shall print all keys.
        System.out.println(englSpansDictionary.keySet());
        //These shall print all values
        System.out.println(englSpansDictionary.values());
        //These shall print size of the dictionary
        System.out.println(englSpansDictionary.size());


        System.out.println();
        System.out.println();

       //shopping list

       Map<String, Boolean> shoppingList = new HashMap<String,Boolean>();
       // put some stuff in the dictionary
        shoppingList.put("Ham", Boolean.TRUE);
        shoppingList.put("Bread", Boolean.FALSE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.TRUE);
        //Printing out keys.
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Bread"));

        //removing elements from shoppingList
        shoppingList.remove("Eggs");//I don't like eggs and therefore, I shall remove this




        //key value pairs
        System.out.println(shoppingList.toString());

        //Replace a value for a certain key
        shoppingList.replace("Bread" , true);
        //print the list
        System.out.println(shoppingList.toString());

        //Clear out dictionary
        shoppingList.clear();
        //again checking if the the dictionary is empty
        /*Way 1*/System.out.println(shoppingList.toString()); //This shows what's in the distionary now
        /*Way 2*/System.out.println(shoppingList.isEmpty());  //This gives true or false if the dictionary is empty or not.


    }
}
