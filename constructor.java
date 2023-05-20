public class constructor
 {
    public static void main(String[] args)
    {
        human Human=new human("sijil",23);
        human Human2=new human("jacob",76);
        System.out.println(Human.age);
        System.out.println(Human2.age);
    }
}
class human
{
    String name;
    int age;

    human(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}