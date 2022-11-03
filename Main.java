import java.util.Scanner;
public class Main
{
    /**
     * Testing my Reverse Polish Notation class
     * Author: Libby Kenigsberg
     */
    public static void main(String[] args)
    {
        final Scanner input = new Scanner(System.in);

        System.out.println("Please enter an RPN expression or <CR> to exit");
        String userInput = input.nextLine();

        while (!userInput.equals(""))
        {
            System.out.println(RPN.evaluate(userInput));

            System.out.println("Please enter an RPN expression or <CR> to exit");
            userInput = input.nextLine();
        }
        System.out.println("You have successfully left the RPN calculator");

    }
}
