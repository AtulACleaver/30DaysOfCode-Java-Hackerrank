package person;

import static person.HairColor.*;

public class Person {
    //Enum is a special kind of datatype that allows for a variable to be one of a set of pre-defined constants.
   HairColor hairColor = BlACK;

   public Person(){

   }
    public static void main(String[] args) {
        Person peterParker = new Person();
        //Aliasing
        Person spiderMan = peterParker;     //This is also know as Aliasis

        System.out.println("Hair color of Peter Parker: " + peterParker.hairColor
                + " is similar to the hair color of spiderman, which is " + spiderMan.hairColor);
   
        //Now, I would change the colour of hair of peterParker and theis aliasis will also change the hair color Spiderman
         peterParker.hairColor = GREEN;System.out.println("Hair color of spiderman: " + spiderMan.hairColor);




   }
}
