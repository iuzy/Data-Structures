import java.util.Scanner;
import java.util.Stack;

public class DS2 {

    public static void main(String[] args) {
        System.out.println("Enter your string:");
        Scanner input = new Scanner(System.in);
        String originalString = input.nextLine();
        originalString = originalString.replaceAll("\\W", "");
        originalString = originalString.toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < originalString.length(); i++) {
            stack.push(originalString.charAt(i));
        }

        StringBuilder reverseString = new StringBuilder();

        while (!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }

        if (originalString.equals(reverseString.toString())) {
            System.out.println("This is a palindrome!");
        } else {
            System.out.println("This is not a palindrome!");
        }
        System.out.println();
    }
}