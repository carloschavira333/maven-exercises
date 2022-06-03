import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenEx {
    public static void main(String[] args) {

        // a. Tells whether or not what the user entered is a number
        System.out.println(StringUtils.isNumeric("4"));
        // b. Flips the case of the string
        System.out.println(StringUtils.swapCase("ABC"));
        // c. Reverses the string
        System.out.println(StringUtils.reverse("string"));
        // Example Console Output
        System.out.println("Enter something: ");
        Scanner prompt = new Scanner(System.in);
        String userInput = prompt.nextLine();
        System.out.println("Your Entered: " + userInput);
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }
}
