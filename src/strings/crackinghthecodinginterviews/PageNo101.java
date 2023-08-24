package strings.crackinghthecodinginterviews;

import java.util.Arrays;

/**
 * Questions : 101 (pdf)
 * Answers : 203 (pdf)
 */


class Chinmay{
    /**
     * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
     * cannot use additional data structures?
     */
    public static boolean isUnique(String str){
        char [] strarr = str.toCharArray();
        Arrays.sort(strarr);
        for (int i = 1; i < strarr.length; i++) {
            if(strarr[i]==strarr[i-1]){
                return false;
            }
        }
        return true;
    }
}


public class PageNo101 {
    public static void main(String[] args) {
        System.out.println(Chinmay.isUnique("chinmay"));
        System.out.println(Chinmay.isUnique("chinmaya "));
    }
}
