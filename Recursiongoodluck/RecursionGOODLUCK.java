package Recursiongoodluck;

public class
RecursionGOODLUCK {
    //The process of defining a function or calculating a number by the repeated application of an algorithm.

    //f(f(f(a))) --- a = 20
    //f(a) = 5+a
    //f(20) = 5 + 20 = 25

    //f(f(a)) = f(25) = 5 + 25 = 30
    //f(f(f(a))) = f(30) = 5+30 = 35
    //∴ f(f(f(a))) = 35;

    //3+2+1
    public static int summation (int n){
        //Base case: We are at the end
        if (n <= 0){
            return 0; // additive identity property.
            // Recursive Case: Keep Going
        }else{
            // n + summation(n-1) = 3 + 3-1
            //3 + 2 + summation (2-1)
            //3+ 2 +1 + 0
            return n + summation(n-1);
        }
    }
    // 6 * 5 *4 * 3* 2* 1
    public static int Factorial (int n){
        //Base Case:
        if (n <= 1 ){
            return 1;
            // Recursive Case
        }else {
            return n * Factorial(n-1);
        }
    }
    // 5^3 = 5*5*5
    public static int exponentiation(int n, int p){
        // Base Case:
        if (p <= 0){
            return 1;
            //Recursive Case
        }else{
            return n * exponentiation(n , p-1);
        }
    }

    public static void main(String[] args) {

        System.out.println(summation(3));
        System.out.println(Factorial(4));
        System.out.println( exponentiation(6, 3));




    }

}
