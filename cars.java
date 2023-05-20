public class cars
{
    public static void main(String[] args)
    {
        car myCar=new car();
        System.out.println(myCar.make);
        myCar.drive();
    }
}
class car
{
    String make="bmw";
    void drive()
    {
        System.out.println("auto drive");
    }
}
