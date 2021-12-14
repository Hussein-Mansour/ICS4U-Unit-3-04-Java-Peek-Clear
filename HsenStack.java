/*
* This program is a stack class.
*
* @author  Hsen Mansour
* @version 1.0
* @since   2021-12-07
*/

import java.util.ArrayList;

/**
* This is the stack class program.
*/
public class HsenStack {
    /**
    * Stack variable.
    */
    private ArrayList<Integer> stack = new ArrayList<Integer>();

    /**
    * Push Method adds value to stack.
    *
    * @param pushValue push value.
    */
    public void push(final int pushValue) {
        stack.add(pushValue);
    }

    /**
    * Pop Method.
    *
    * @return return -1.
    */
    public Integer pop() {
        final int size = stack.size();
        if (size == 0) {
            System.out.println("The stack is Empty!");
        } else {
            return stack.remove(0);
        }
    }

    /**
    * Peek Method.
    *
    * @return return -1.
    */
    public Integer peek() {
        final int size = stack.size();
        final int gett = stack.get(0);
        if (size == 0) {
            System.out.println("Error");
        } else {
            System.out.print("The element at the top of the"
                               + " stack is: " + gett);
        }
        return -1;
    }

    /**
    * Clear Method.
    */
    public void clear() {
        // Clearing the stack using clear() method
        stack.clear();

        // Displaying the final stack after clearing;
        System.out.println("The final stack: " + stack);
    }

    /**
    * Array size Method.
    *
    * @return sizee.
    */
    public int arraysize() {
        final int sizee = stack.size();
        return sizee;
    }

    /**
    * Prints stack.
    */
    public void showStack() {
        System.out.println(stack);
    }
}
