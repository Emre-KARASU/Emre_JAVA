package ekipco;

public class Sannas_Emre {
    public static void main(String[] args) {
        String str = "hellosannasmith";
        String longestPalindrome = findLongestPalindrome(str);
        System.out.println(longestPalindrome);
    }

    public static String findLongestPalindrome(String str) {
        String longestPalindrome = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                if (isPalindrome(substring) && substring.length() > longestPalindrome.length()) {
                    longestPalindrome = substring;
                }
            }
        }
        return longestPalindrome;
    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
