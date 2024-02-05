package small_tasks.pollindrome;

public class Pollindrome {

    public static boolean isPalindrome(String text) {
        String str = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        String message = "Madam, I'm Adam!";
        System.out.println(isPalindrome(message));
    }
}
