package RunTimePractice;

import java.util.HashMap;

public class RunTimePractice {

    public static int findNumbsOfRepetitions(String s, char c){
        //Linear time O{n} time
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                sum++;
            }
        }
        return sum;
    }

    public static int[] findNumbsOfRepetitions1(String s, char[] c){

        // This is quadratic time: O{n*m) time
        int[] sums = new int[c.length]; // 1
        for(int i = 0; i< s.length(); i++){ // n, n+1, n+2
            for (int j = 0; j<c.length; j++ ){//n, nm + 1, nm
                if(s.charAt(i) == c[j] ){
                    sums[j] = sums[j] + 1;
                }
            }
        }
        return sums;
    }

    public static int[] findNumbsOfRepetitions2 (String s, char[] c){
        //Optimal time: O(n+m)
        int[] sums = new int [c.length];
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i<s.length(); i++){
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }else{
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum+1);
            }
        }
        for (int j = 0; j<c.length; j++){
            int sum;
            if(!map.containsKey(c[j])){
                sums[j]=0;
            }else{
                sums[j] = map.get(c[j]);
            }
        }
        return sums;
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        System.out.println(findNumbsOfRepetitions("fsdfkjlaksjdfklsdkjflkasdlkflksjdfkjasdfjsdkflksdlfklsdkjflflsjdflsdlfkjslkdfkwerlkfjljcvxzjlksjdlfjwalkerlkjkcjvklakjflkjwerkwjlcjkvlkxcvljolkjdslfpjsjdfljsdlkflkweav" , 'a'));

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test: " + duration + "ms");

        char[] a = {'a' , 'b'};
        startTime = System.currentTimeMillis();

        System.out.println(findNumbsOfRepetitions1("fsdfkjlaksjdfklsdkjflkasdlkflksjdfkjasdfjsdkflksdlfklsdkjflflsjdflsdlfkjslkdfkwerlkfjljcvxzjlksjdlfjwalkerlkjkcjvklakjflkjwerkwjlcjkvlkxcvljolkjdslfpjsjdfljsdlkflkweav" , a));

        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test: " + duration + "ms");

        startTime = System.currentTimeMillis();

        System.out.println(findNumbsOfRepetitions2("fsdfkjlaksjdfklsdkjflkasdlkflksjdfkjasdfjsdkflksdlfklsdkjflflsjdflsdlfkjslkdfkwerlkfjljcvxzjlksjdlfjwalkerlkjkcjvklakjflkjwerkwjlcjkvlkxcvljolkjdslfpjsjdfljsdlkflkweav" , a));

        endTime = System.currentTimeMillis();
         duration = endTime - startTime;
        System.out.println("Test: " + duration + "ms");
    }

}
