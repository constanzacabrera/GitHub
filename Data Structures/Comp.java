import java.util.Comparator;
 
class Comp
{
    String name;
    int age;
 
    public Comp(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
 
    public String toString()
    {
        return name+" : "+age;
    }
}
 
class MyComparator implements Comparator<Comp>
{
  
    public int compare(Comp c1, Comp c2)
    {
        return c1.age - c2.age;
    }
}
