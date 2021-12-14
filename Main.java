/*
* This program test the stack class
*
* @author  Hussein Mansour
* @version 1.0
* @since   2021-12-07
*/

import java.util.Scanner;

/**
* This is the stack class program.
*/
final class Main {
    /**
    * Constant.
    */
    public static final int TEN = 10;
    /**
    * Constant.
    */
    public static final int ELEVEN = 11;
    /**
    * String.
    */
    public static final String STR = "The stack list";
    /**
    * String.
    */
    public static final String STRONE = "Adding the number ... ";
    /**
    * String.
    */
    public static final String STRTWO = "End of stack list ";
    /**
    * Space.
    */
    public static final String SPACE = "\n";

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting... the main method
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final HsenStack stack = new HsenStack();

        try {
            // The stack no adds
            System.out.print("THE STACK" + SPACE);
            System.out.println(SPACE + STR + SPACE);
            stack.showStack();
            System.out.print(SPACE + STRTWO + SPACE);
            // END

            // The stack with add
            while (true) {
                // User Input
                final Scanner myObj = new Scanner(System.in);
                System.out.print(SPACE + "Enter a number to add it to the stack ");
                System.out.print("(-1 to Exit) : ");
                final int userInput = myObj.nextInt();
                // to stop
                if (userInput == -1) {
                    break;
                }
                // Adding user input to the stack
                System.out.print(SPACE + STR);
                System.out.println(SPACE + STRONE + SPACE);
                stack.push(userInput);

                stack.showStack();
                System.out.print(SPACE + STRTWO + SPACE);
            }
            // END

            // Pop element from the stack
            while (true) {
                // User Input
                final Scanner myObjTwo = new Scanner(System.in);
                System.out.print(SPACE + "Enter the index number you want ");
                System.out.print("to pop the element from the stack ");
                System.out.print("(-1 to Exit): ");
                final int userInput = myObjTwo.nextInt();
                // to stop
                if (userInput == -1) {
                    break;
                }
                // poping out
                System.out.print(SPACE + STR);
                System.out.println(SPACE + "Pop the element: " + SPACE);

                final int topp = stack.pop();

                stack.showStack();
                System.out.println(SPACE + STRTWO + SPACE);

                // peek & clear with error check
                final int arraysizee = stack.arraysize();
                if (arraysizee == 0) {
                    System.out.println(SPACE + "The stack is Empty!" + SPACE);
                    break;
                } else {
                    // Peek the stack
                    System.out.print(SPACE);
                    final int top = stack.peek();
                    // Empty the stack
                    System.out.println(SPACE);
                    stack.clear();
                }
            }
        } catch (java.util.InputMismatchException errorCode) {
            System.err.print(SPACE + "Invailed Input!" + SPACE);
        }
        // Done.
        System.out.print(SPACE + "Done." + SPACE);
    }
}
