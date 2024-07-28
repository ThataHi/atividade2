package ex2_StringBuilder;

public class Ex2_vogal {

	public static void main(String[] args) {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!Vogal(c)) {
                sb.append(c);
            }
        }

        String result = sb.toString();
        System.out.println(result);
    }

    private static boolean Vogal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
