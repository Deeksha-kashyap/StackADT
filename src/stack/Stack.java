package stack;
import java.util.Arrays;

public class Stack {
    int size;
    int topOfStack = -1;
    int[] stackArray;

    public Stack(int size)
    {
        this.size = size;
        stackArray = new int[size];
    }

    void push(int value)
    {
        // check if the array is already full
        if (!isFull()) // if stackArray is NOT full
        {
            topOfStack++;
            stackArray[topOfStack] = value;
        }

    }

    int pop()
    {

        int response = 0;

        // check if the array is already empty
        if (!isEmpty())
        {
            stackArray[topOfStack] = 0;
            topOfStack--;
        }

        return response;

    }

    int peek()
    {
        int response = 0;

        if (!isEmpty())
        {
            response = stackArray[topOfStack];
        }

        return response;

    }


    boolean isFull()
    {
        boolean response = false;

        if ((stackArray[stackArray.length - 1] != 0)
                && (topOfStack == (stackArray.length - 1)))
        {
            response = true;
        }

        return response;
        //  [2, 3, 4, 5, 6] 4
        //               T -- 4
    }


    boolean isEmpty()
    {
        boolean response = false;

        if (topOfStack == -1)
        {
            response = true;
        }

        return response;
    }

    public static void main(String[] args)
    {

        Stack stack = new Stack(10);

        for (int length = stack.stackArray.length - 1;
             length >= 0; length--)
        {
            System.out.println(stack.stackArray[length]);
        }

        for (int i = 0; i < 10; i++)
        {
            stack.push(2 + i);
        }

        System.out.println("-------------------------");

        for (int length = stack.stackArray.length - 1;
             length >= 0; length--)
        {
            System.out.println(stack.stackArray[length]);
        }

        stack.pop();
        stack.pop();

        System.out.println(Arrays.toString(stack.stackArray));

        System.out.println(stack.isFull());

    }
}
