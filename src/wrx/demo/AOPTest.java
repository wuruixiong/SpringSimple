package wrx.demo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("AOPTest")
// 使用注解，定义切面
@Aspect
/**
 * 通知（advice）:五种通知方式：
 * @Before：前置通知，在调用目标方法之前执行通知定义的任务
 * @After：后置通知，在目标方法执行结束后，无论执行结果如何都执行通知定义的任务
 * @After-returning：后置通知，在目标方法执行结束后，如果执行成功，则执行通知定义的任务
 * @After-throwing：异常通知，如果目标方法执行过程中抛出异常，则执行通知定义的任务
 * @Around：环绕通知，在目标方法执行前和执行后，都需要执行通知定义的任务。
 */
public class AOPTest {
    //使用注解，定义切点，尝试多种切点写法，都可用
    //@Pointcut("execution(* *.saying(..))")
    //@Pointcut("execution(* SayHello.saying(..))")
    //@Pointcut("execution(* SayHello.saying())")
    @Pointcut("execution(* wrx.demo.SayHello.saying())")
    public void sayings(){
    }

    /**
     * 前置通知
     * 注意@Before注解的这个值"sayings()"，就是前面 @Pointcut切点所注解的方法
     */
    @Before("sayings()")
    public void sayHello(){
        System.out.println("注解类型前置通知");
    }

    //后置通知
    @After("sayings()")
    public void sayGoodbey(){
        System.out.println("注解类型后置通知");
    }

    //环绕通知。注意要有ProceedingJoinPoint参数传入。
    @Around("sayings()")
    public void sayAround(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("注解类型环绕通知..环绕前");
        pjp.proceed();//执行方法
        System.out.println("注解类型环绕通知..环绕后");
    }
}