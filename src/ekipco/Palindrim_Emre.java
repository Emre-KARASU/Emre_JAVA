package ekipco;

public class Palindrim_Emre {
    public static void main(String[] args) {
        String str = "cats AND*Dogs-are Awesome";
        String transformedStr = transformString(str);
        System.out.println(transformedStr);
    }

    public static String transformString(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", ""); // yalnızca harf ve sayıları içerecek şekilde temizleme
        str = str.toLowerCase(); // küçük harflere dönüştürme
        StringBuilder sb = new StringBuilder(str);
        sb.replace(0, 1, sb.substring(0, 1).toUpperCase()); // ilk harfi büyük harfe dönüştürme
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') { // boşlukları kaldırma ve sonraki karakterleri büyük harfe dönüştürme
                sb.deleteCharAt(i);
                sb.replace(i, i + 1, sb.substring(i, i + 1).toUpperCase());
            }
        }
        return sb.toString();
    }
}
