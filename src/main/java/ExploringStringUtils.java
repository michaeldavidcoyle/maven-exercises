import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ExploringStringUtils {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        String userInput = input.next();

        if (StringUtils.isNumeric(userInput)) {
            System.out.println("You entered a number!");
        } else {
            System.out.println("Sorry, that is not a number.");
        }
    }
}
