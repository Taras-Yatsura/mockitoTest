package classes;

public class A {
    private String a = "classes.A";

    public String getA()
    {
        return a;
    }

    public String getFromB()
    {
        return new B().getB();
    }
}
