public class function
{
    public static void main(String[] args)
    {
        int z=add(1,2);
        System.out.println(z);
        int x=add(1,2,3);
        System.out.println(x);
    }
    static int add(int a,int b)
    {
        System.out.println("overloded");
        return a+b;
    }
    static int add(int a,int b,int c)
    {
        System.out.println("overloded");
        return a+b+c;
    }
}
