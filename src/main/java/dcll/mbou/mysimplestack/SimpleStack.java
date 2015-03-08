package dcll.mbou.mysimplestack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by Morgane on 26/02/2015.
 */
public class SimpleStack implements IStack {

    /**
     * Param stack_att.
     */
    private Stack stackAtt = new Stack<SimpleItem>();

    /**
     * Return a boolean to know if stack is empty.
     * @return stackAtt an boolean.
     */
    @Override
    public final boolean isEmpty() {
        return this.stackAtt.isEmpty();
    }

    /**
     * Return size of stack.
     * @return 0 a size.
     */
    @Override
    public final int getSize() {
        return this.stackAtt.size();
    }

    /**
     * To push an item to stack.
     * Commentaire répondant à l'exigence #1
     * @param item an item.
     */
    @Override
    public final void push(final SimpleItem item) {
        this.stackAtt.push(item);
    }

    /**
     * To peek an item.
     * @throws EmptyStackException if this stack is empty.
     * @return null Return null..
     */
    @Override
    public final SimpleItem peek() throws EmptyStackException {
        return (SimpleItem) (this.stackAtt.peek());
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     * @throws EmptyStackException if this stack is empty.
     * @return null Return null.
     */
    @Override
    public final SimpleItem pop() throws EmptyStackException {
        return (SimpleItem) (this.stackAtt.pop());
    }
}
