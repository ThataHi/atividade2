package ex2_string_builder;

public class Ex2_vogal {

	public static void main(String[] args) {
        String input = "Este é um exemplo de string";
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!isVowel(c)) {
                sb.append(c);
            }
        }

        String result = sb.toString();
        System.out.println(result);
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
