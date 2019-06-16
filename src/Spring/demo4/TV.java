package Spring.demo4;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TV {
    @Pointcut("execution(** Spring.demo4.WatchTV.play(..))")
    public void play(){}

    @Before("play()")
    public void takeOnTV(){
        System.out.println("打开电视");
    }

    @After("play()")
    public void takeOffTV(){
        System.out.println("关闭电视");
    }
}
