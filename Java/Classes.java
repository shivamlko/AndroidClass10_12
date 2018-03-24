
class Classes
{

    int x=1,y=1;
    static String name="ABC";

    static
    {
        System.out.println("STATIC");
    }

public static void main(String[] args) {
// String arg[]
// String...a
    // Classes.main()
    
    System.out.println("MAIN "+args[0]+" "+args[1]);

    Classes object=new Classes();
    Classes object2=new Classes();

    int sum=object.sum(5, 2);
    int sum2=object.sum(5, 2,3);

    System.out.println(sum+" "+sum2);
    System.out.println("---------------");

    System.out.println(object.x +" "+object2.x);
    object.x++;

    System.out.println(object.x +" "+object2.x);
    
    System.out.println(object.x +" "+new Classes().x);
    new Classes().x++;
    System.out.println(object.x +" "+new Classes().x);


    System.out.println(Classes.name);
    System.out.println(object.name +" "+object2.name);

    object.name="XYZ";
    System.out.println(object.name +" "+object2.name+" "+Classes.name);

    Classes.square(5);

    object.print("XYZ","ABC");
    

}

public static void main(String s)
{

}

public static void print(String...s)
{
 System.out.println(s[0]+" "+s.length);
}


private static int square(int a)
{
 
    return a*a;
}


private int sum(int a,int b)
{
  //  System.out.println( minus(a, b)+" "+x);

    return a+b;
}


private int sum(int a,int b,int c)
{
  //  System.out.println( minus(a, b)+" "+x);

    return a+b+c;
}


private int minus(int a,int b)
{

    return a-b;
}

}