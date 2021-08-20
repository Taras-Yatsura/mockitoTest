package aspectj;

import org.aspectj.lang.Aspects;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectB {

    /*@Pointcut("if()")
    public static boolean useAspect()
    {
        return NewTest.isUseAspect();
    }*/

    @Pointcut("call(* classes.B.getB())")
    public void callTestMethod() {}


    @Around("callTestMethod()")
    public String myAdvice(ProceedingJoinPoint point) throws Throwable {
        return "You have been hacked!";
    }
}
