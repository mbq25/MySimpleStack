package dcll.mbou.mysimplestack;

import java.util.EmptyStackException;

/**
 * Created by Morgane on 08/03/2015.
 */
public interface IStack {
        /**
         * Tests if this stack is empty.
         * @return boolean
         */
        boolean isEmpty();

        /**
         * Returns the number of items in this stack.
         * @return int
         */
        int getSize();

        /**
         * Pushes an item onto the top of this stack.
         * null item is allowed.
         * @param item Item to push on stack.
         */
        void push(SimpleItem item);

        /**
         * Looks at the object at the top of this stack
         * without removing it from the stack.
         * @throws EmptyStackException if this stack is empty.
         * @return SimpleItem
         */
        SimpleItem peek() throws EmptyStackException;

        /**
         * Removes the object at the top of this stack and returns
         * that object as the value of this function.
         * @throws EmptyStackException if this stack is empty.
         * @return SimpleItem
         */
        SimpleItem pop() throws EmptyStackException;

    }
