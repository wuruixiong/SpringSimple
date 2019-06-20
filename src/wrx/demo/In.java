package wrx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class In {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

        Man student = (Man)ac.getBean("man");
        System.out.println(student.getName());
        System.out.println(student.getAge());


    }

}
