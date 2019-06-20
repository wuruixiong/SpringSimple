package wrx.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//DI依赖注入
//@Component,@Service,@Controller,@Repository
//带有这些注解的类，并把这些类纳入进spring容器中管理
@Component(value = "person")
public class Person {

    @Value("blues")
    private String name;
    @Value("28")
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
