package wrx.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "man")
public class Man {

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
