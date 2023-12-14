package sixp.spring.starter_project.beans_components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;


//YourBusinessClass
@Component
class YourBusinessClass{
    @Autowired
    Dependency1 dep;
    @Autowired
    Dependency2 edp;

    public String tostring(){
        return "using "+ dep+ " and " + edp;
    }

}

@Component
class Dependency1{

}


@Component
class Dependency2{

}

@ComponentScan
public class DepInjectionLauncherApplication {

    public static void main(String[] args) {
        try(var context =
                    new AnnotationConfigApplicationContext
                (DepInjectionLauncherApplication.class)){

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));


        }
    }
}
