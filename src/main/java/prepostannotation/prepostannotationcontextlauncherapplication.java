package prepostannotation;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class SomeClass{
    private somedependency somedependency;

    public SomeClass(somedependency somedependency){
        super();
        this.somedependency = somedependency;
        System.out.println("all dependency are ready");

    }
    @PostConstruct
    public void initialization (){
        somedependency.getReady();

    }
}

@Component
class somedependency {

    public void getReady() {
        System.out.println("some logic using some dependency");
    }
}
@Configuration
@ComponentScan
public class prepostannotationcontextlauncherapplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext
                (prepostannotationcontextlauncherapplication.class)){

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}



