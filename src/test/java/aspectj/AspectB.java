package aspectj;

import org.aspectj.lang.Aspects;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectB {

//    @Pointcut("if()")
//    public static boolean useAspect()
//    {
//        return NewTest.isUseAspect();
//    }

    @Pointcut("execution(* classes.B.getB())")
    public void callTestMethod() {}

    /*@Pointcut("call(* *(..)) && !within(AspectB)")
    public void callAll() {}*/

    /*@Around("callAll()")
    public Object totalAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println(pjp.getSignature());
        return pjp.proceed();
    }*/


    @Around("callTestMethod()")
    public Object myAdvice(ProceedingJoinPoint point) throws Throwable {
        point.proceed();
        return "You have been hacked!";
    }
}
