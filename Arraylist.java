import java.util.*;
class Arraylist{
    public static void main(String args[])
    {
        Arraylist<String> a = new Arraylist<String>();
        a.add(e, "Red");
        a.add(e,"Green");
        a.add(e,"Blue");
        a.add(e,"Yellow");
        System.out.println(a);
        for(String i:a )
        {
            System.out.println(i);
        }
    }
}