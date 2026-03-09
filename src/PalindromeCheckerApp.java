import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Palindrome Checker Management System");
        System.out.println("   Version 5.0");
        System.out.println("   System initialized successfully.");
        System.out.println("======================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        Queue<Character> queue = new LinkedList<>();

        Stack<Character> stack = new Stack<>();

        for (char c : processedInput.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;
        String reversed = "";

        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();
            char fromStack = stack.pop();

            reversed += fromStack;

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Reversed String : " + reversed);

        if (isPalindrome) {
            System.out.println("Result : The string IS a palindrome");
        } else {
            System.out.println("Result : The string is NOT a palindrome");
        }

        System.out.println("System execution completed successfully.");

        scanner.close();
    }
}