package sixp.spring.starter_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age){}
@Configuration
public class HelloWorldconfiguration {

    @Bean
    public String name(){
        return "Rounak";
    }

    @Bean
    public Person person(){
        var person = new Person("Ravi",20);
        return person;
    }

}
