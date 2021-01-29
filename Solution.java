import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    void permutation(int n, int k){
        
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();

        Set<Integer> numberSet = new HashSet<>();

        for (int i = 1; i <= t; i++){
            numberSet.add(i);
        }

        int greatestAns = 0;

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            for (int )
        }



    }
}
