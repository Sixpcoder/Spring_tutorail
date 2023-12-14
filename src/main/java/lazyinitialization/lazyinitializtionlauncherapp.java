package lazyinitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import sixp.spring.starter_project.beans_components.DepInjectionLauncherApplication;

import java.util.Arrays;

@Component
class ClassA{

}

@Component
@Lazy
class ClassB{
    private  ClassA classa;
    public  ClassB(ClassA classa){
        System.out.println("some initialization logic");
        this.classa = classa;

    }

    public void dosomething(){
        System.out.println("hey yo ");
    }
}

@Configuration
@ComponentScan
public class lazyinitializtionlauncherapp {
    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (lazyinitializtionlauncherapp.class)) {

            System.out.println("initialization of context is completed");
            context.getBean(ClassB.class).dosomething();

        }
    }
}
