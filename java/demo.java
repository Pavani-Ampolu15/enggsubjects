class demo
{
    public static void main(String args[])
    {
        System.out.println("hello world");
        int i=10;
        int j=20;
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i*j);
        System.out.println(i/j);
        System.out.println(i%j);
        while(i>j)
           System.out.println("i is greater"+i);
        do{
            System.out.println("i is greater"+i);
        }while(i>j);
        for(;i<30;i++)
        {
            System.out.println("its always me"+i);
        }
    }
}