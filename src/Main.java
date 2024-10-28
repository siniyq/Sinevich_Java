//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter algorithm number (0 to exit): ");
            int n;

            try {
                n = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            if (n == 0) {
                System.out.println("The program is completed.");
                break;
            }

            switch (n) {
                case 1:
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    scanner.nextLine();

                    if (number > 7) {
                        System.out.println("Hello");
                    }
                    break;

                case 2:
                    System.out.print("Enter a name: ");
                    String name = scanner.nextLine();
                    if (name.equals("John")) {
                        System.out.println("Hello, John");
                    } else {
                        System.out.println("There is no such name");
                    }
                    break;

                case 3:
                    System.out.print("Enter the number of elements in the array: ");
                    int arraySize = scanner.nextInt();
                    int[] array = new int[arraySize];

                    System.out.println("Enter array elements:");
                    for (int i = 0; i < arraySize; i++) {
                        array[i] = scanner.nextInt();
                    }
                    scanner.nextLine();

                    System.out.println("Elements that are multiples of 3:");
                    for (int element : array) {
                        if (element % 3 == 0) {
                            System.out.print(element + " ");
                        }
                    }
                    System.out.println();
                    break;

                default:
                    System.out.println("Unknown algorithm number. Try again.");
            }
        }

        scanner.close();
    }
}

/* TASK 2

[((())()(())]]
This sequence incorrect

Add a closing parenthesis ) at the end of a sequence of parentheses to balance the parentheses.
Add an opening square bracket ] at the beginning to balance the square brackets.

[[((())()(()))]]


OR

Remove the opening parenthesis ) at the beginning of the parenthesis sequence to balance the parentheses.
Remove the closing square bracket ] at the end to balance the square brackets.

[(())()(())]

 */

