package ekipco;


public class Palindrim {
    public static void main(String[] args) {
        String str="hellosannasmith";
        System.out.println(enUzunPalindrome(str));
    }
    public static String enUzunPalindrome(String str) {
        if (str == null || str.length() < 1) {
            return "";
        }

        int start = 0, end = 0;
        for (int i = 0; i < str.length(); i++) {
            int len1 = genislet(str, i, i);
            int len2 = genislet(str, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return str.substring(start, end + 1);

    }
    public static int genislet(String str, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < str.length() && str.charAt(L) == str.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;

    }
}