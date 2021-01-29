package arraypractice;

import java.util.Arrays;

public class ArrayPractice {
    public static <E> void printArray(E[] array){
        for (E element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

//         {0, 4, 5, 5, 6}
//         its length is 5
//
//        Index:    0       1       2
//        Array: {"bob", "Sally", "max"}       --> length 3

        Integer[] intArray1;
        Integer[] intArray2 = new Integer[4];
        Integer[] intArray3 = {4 , 5 , 5 , 3 , 3};
            printArray(intArray2);
        String[] shoppingList = {"banana","apples", "pears"};
        //Checking the size of the array
        System.out.println(intArray2.length);



































        // initializing intArray2;
        intArray2[0]=2;
        intArray2[1]=2;
        intArray2[2]=2;
        intArray2[3]=2;


        //Printing arrays

        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println(Arrays.toString(shoppingList));

        //Custom print out arrays.

        printArray(intArray3);

        //printing single elment
        System.out.println(intArray2[3]);

        //given functions in arrays.
        //Array function 1 sort
        Arrays.sort(intArray3);
        printArray(intArray3);

        //special for loop for eachloop

        for (String s: shoppingList){
            System.out.println(s);
        }
    }
}
