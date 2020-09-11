package wrx.demo.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("a_person")
public class APerson {
    @Value("white")
    private String name;
    @Value("18")
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
