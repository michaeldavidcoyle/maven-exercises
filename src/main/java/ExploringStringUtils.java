import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ExploringStringUtils {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.print("Enter a number: ");
//        String userInput = input.next();
//
//        if (StringUtils.isNumeric(userInput)) {
//            System.out.println("You entered a number!");
//        } else {
//            System.out.println("Sorry, that is not a number.");
//        }

//        System.out.print("Enter full name: ");
//        String userName = input.nextLine();
//
//        System.out.println(StringUtils.swapCase(userName));

        System.out.print("Enter something: ");
        String userInput = input.nextLine();

        System.out.printf("You entered: \"%s\"%n", userInput);

        if (StringUtils.isNumeric(userInput)) {
            System.out.printf("\"%s\" is a number.%n", userInput);
        } else {
            System.out.printf("\"%s\" is not a number.%n", userInput);
        }

        System.out.printf("Flipped case: %s%n", StringUtils.swapCase(userInput));
        System.out.printf("Reversed: %s%n", StringUtils.reverse(userInput));
    }
}
