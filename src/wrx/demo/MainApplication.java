package wrx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wrx.demo.annotation.APerson;

public class MainApplication {

    public static void main(String[] args) {

        ApplicationContext xac = new ClassPathXmlApplicationContext("spring-config.xml");

        // 测试IOC
        Person student = (Person)xac.getBean("person");
        System.out.println(student.getName());
        System.out.println(student.getAge());

        // 测试AOP
        SayHello syh = (SayHello) xac.getBean("hello");
        syh.saying();

        ApplicationContext aac = new AnnotationConfigApplicationContext("wrx.demo.annotation");
        //APerson aPerson = (APerson)aac.getBean(APerson.class);
        APerson aPerson = (APerson)aac.getBean("a_person"); //与上面的 以class为参 效果相同，如果有多个APerson还是要 传 bean name为准
        System.out.println(aPerson.getName());



    }

}
