package wrx.demo;

import org.springframework.stereotype.Component;

@Component("hello")
public class SayHello {
    public void saying(){
        System.out.println("hello..我是切点方法");
    }
}
