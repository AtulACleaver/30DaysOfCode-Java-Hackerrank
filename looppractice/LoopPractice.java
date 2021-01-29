package looppractice;

public class LoopPractice {

    public static void practiceWhileLoop(){    //public void is an instance variable.
        int x = 0;
        while(x < 10){
            System.out.println("The value of x is "+ x);
            x++;
        }
    }
    public static void practiceDoWhileLoop(){
        int x = 0;
        /* In do while loop first we shall perform the do function and then we shall check
        if the statement is still true.
         */
        do{
            System.out.println("The value of x is "+ x);
            x++;
        }while(x<10);


    }
    public static void practiceForLoop(){
        for (int x = 0; x<10; x++){
            for (int y= 0; y<10; y++)
                System.out.println(x+y);
        }
        System.out.println("This is the end");
    }


    public static void main(String[] args) {
        practiceForLoop();
    }
}
