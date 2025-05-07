package DATASTRUCTERS;
public class stackimplarray
{
        static int top=-1;
        static  int stack[]=new int[5];
    public static void main(String args[])
    {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        printstack(stack);
        System.out.println("the popped element is: "+pop());
        System.out.println("the peek element is: "+peek());



    }
    public static void printstack(int stack[])
    {
        for(int i=0;i<=top;i++)
        System.out.print(stack[i]+" ");
    }
    public static void push(int val)
    {
        if(top>=stack.length-1)
        {
            System.out.print("stack overflow");
        }
        else
        {
               top=top+1;
               stack[top]=val;
        }
    }
    public static int pop()
    {
        if(top==-1)
        {
            System.out.println("underflow");
            return -1;
        }
        int temp=stack[top];
        top=top-1;
        return temp;
    }
    public static int peek()
    {
        if(top==-1)
        return -1;
        return stack[top];
    }
}