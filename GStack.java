import java.util.ArrayList;

public class GStack<T> implements IGStack<T>
{

    private ArrayList<T> stack = new ArrayList<>();
    private int top = -1;
    @Override
    public void push(T value)
    {
        stack.add(++top, value);
    }
    @Override
    public T pop()
    {
        T retVal = null;
        if (top != -1)
        {
            retVal = stack.get(top);
            stack.remove(top--);
        }
        return retVal;
    }
    @Override
    public T peek()
    {
        T retVal = null;
        if (top != -1)
        {
            retVal = stack.get(top);
        }
        return retVal;
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
}

