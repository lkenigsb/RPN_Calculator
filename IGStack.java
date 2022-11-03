public interface IGStack<T>
{
    /**
     * push a value on the stuck
     * @param value : T to be pushed
     */
    public void push(T value);
    /**
     * pop the stack and return its hitherto top value
     * @return T: popped value or null if stack is empty
     */
    public T pop();
    /**
     * return the top value of the stack
     * @return T: value at the top of the stock or null if empty
     */
    public T peek();
    /**
     * if it is empty return true if top value is -1
     */
    public boolean isEmpty();
}
