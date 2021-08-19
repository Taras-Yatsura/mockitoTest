import classes.A;
import classes.B;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TestingMockito {

    @Test
    public void mockAusingClass()
    {
        A aObject = spy(A.class);
        doReturn("mock").when(aObject).getA();
        System.out.println(aObject.getA());
        System.out.println(new A().getA());
    }

    @Test
    public void mockAusingObject()
    {
        A a = new A();
        A aObject = spy(a);
        doReturn("mock").when(aObject).getA();
        System.out.println(aObject.getA());
        System.out.println(a.getA());
    }

    @Test
    public void mockBinA()
    {
        B BObject = spy(B.class);
        doReturn("mock").when(BObject).getB();
        System.out.println(BObject.getB());
        System.out.println(new B().getB());
        System.out.println(new A().getFromB());
    }

    @Test
    public void mockBinAusingObject()
    {
        B b = new B();
        B BObject = spy(b);
        doReturn("mock").when(BObject).getB();
        System.out.println(BObject.getB());
        System.out.println(b.getB());
        System.out.println(new A().getFromB());
    }

}
