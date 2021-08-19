package aspectj;

import classes.A;
import classes.B;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class NewTest {
    private static boolean useAspect = false;

    public static boolean isUseAspect() {
        return useAspect;
    }

    @BeforeEach
    void init()
    {
        useAspect = true;
    }

    @Test
    public void changeValue()
    {
        B b = new B();
        System.out.println(b.getB());
    }

    @Test
    public void changeValueInA()
    {
        A a = new A();
        System.out.println(a.getFromB());
    }
}
