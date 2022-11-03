public class RPN
{
    /**
     * Reverse Polish Notation Calculator
     * * Author: Libby Kenigsberg
     *
     * @param expression
     * @return String evaulating the RPN expression
     */
    public static String evaluate(String expression)
    {
        String[] partsOfRPNExpression = expression.split(" ");

        GStack<Double> myStack = new GStack<>();

        for (String partOfExpression : partsOfRPNExpression)
        {
            if ((partOfExpression.equals("+")) || (partOfExpression.equals("-")) || (partOfExpression.equals("*")) || (partOfExpression.equals("/")))
            {
                double val1 = myStack.pop();

                if (myStack.peek() == null)
                {
                    return "Syntax Error";
                }
                double val2 = myStack.pop();


                if (partOfExpression.equals("+"))
                {
                    myStack.push(val2 + val1);
                }
                else if (partOfExpression.equals("-"))
                {
                    myStack.push(val2 - val1);
                }
                else if (partOfExpression.equals("*"))
                {
                    myStack.push(val2 * val1);
                }
                else //(arrayOfElement.equals("/"))
                {
                    myStack.push(val2 / val1);
                }
            }
            else
            {
                try
                {
                    double ifNumber = Double.parseDouble(partOfExpression);
                } catch (NumberFormatException nfe)
                {
                    return "Syntax Error";
                }
                //now it is definetly a number
                myStack.push(Double.valueOf(partOfExpression));
            }
        }

        String value = String.valueOf(myStack.pop());
        if (myStack.isEmpty())
        {
            return value;
        }
        else
        {
            return value + "\n extra junk ignored";
        }
    }
}