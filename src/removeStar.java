import java.util.Scanner;
import java.util.Stack;

public class removeStar {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c != '*') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        removeStar solution = new removeStar();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string with stars: ");
        String s = scanner.nextLine();

        String result = solution.removeStars(s);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
