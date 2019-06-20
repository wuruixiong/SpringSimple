package wrx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class In {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

        // 测试IOC
        Person student = (Person)ac.getBean("person");
        System.out.println(student.getName());
        System.out.println(student.getAge());

        // 测试AOP
        SayHello syh = (SayHello) ac.getBean("hello");
        syh.saying();

    }

}
