package generic;

public class Generics implements Comparable{

    public static <T extends Comparable<T>> T findMax(T a, T b) {
        int n = a.compareTo(b);
        if (n < 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(findMax(10 , 3));  //gives int
        System.out.println(findMax(2.0, 3.8));
        System.out.println(findMax('a' , 'b'));
        System.out.println(findMax("Atul Anand" , "Jayant Raj"));

        Generics k = new Generics();
        System.out.println(findMax(k , k));
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
