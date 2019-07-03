import java.util.Arrays;

public class Anagram {
    static boolean areAnagram(String firstString, String secondString){
        // convert the strings to character arrays
        char[] str1 = firstString.toCharArray();
        char[] str2 = secondString.toCharArray();

        // if the string lengths are not the same then definitely not anagram
        if(str1.length != str2.length){
            return false;
        }

        // Sort both strings. Once sorted, the characters in both strings will have the same order
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String [] args){
        String a = "abcd";
        String b = "dcab";

        if(areAnagram(a, b)){
            System.out.println("The two strings are anagram");
        } else{
            System.out.println("The two strings are not anagram");
        }
    }

}
