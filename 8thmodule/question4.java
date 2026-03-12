import java.util.Arrays;
public class question4 {

        public static boolean isAnagram(String str1, String str2) {
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            if (str1.length() != str2.length()) {
                return false;
            }

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return Arrays.equals(charArray1, charArray2);
        }

        public static void main(String[] args) {
            String s1 = "Listen";
            String s2 = "Silent";
            String s3 = "Hello";
            String s4 = "World";

            System.out.println("Are \"" + s1 + "\" and \"" + s2 + "\" anagrams? : " + isAnagram(s1, s2));
            System.out.println("Are \"" + s3 + "\" and \"" + s4 + "\" anagrams? : " + isAnagram(s3, s4));
        }
    }

