package ekipco;

public class Emre {
    public static void main(String[] args) {
        String str = "cats AND*Dogs-are Awesome";
        String[] words = str.split("[^a-zA-Z]+");
        StringBuilder resultBuilder = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                resultBuilder.append(word.substring(0, 1).toUpperCase());
                if (word.length() > 1) {
                    resultBuilder.append(word.substring(1).toLowerCase());
                }
            }
        }
        String result = resultBuilder.toString();
        System.out.println(result);

    }
}
