package sixp.spring.starter_project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class App02HelloWorldSpring {

    public static void main(String[] args) { 
        //launch a spring context
     try( var context =
              new AnnotationConfigApplicationContext
                      (HelloWorldconfiguration.class)) {
         ;
         //i want spring to manage a bran
         //name -@Bean
         //Retrieving beans managed by spring

         //configure the thing that we want spring to manage using -@configuraion class
         System.out.println(context.getBean("name"));
         System.out.println(context.getBean("person"));

         Arrays.stream(context.getBeanDefinitionNames())
                 .forEach(System.out::println);
     }catch (Exception e)
     {
         e.printStackTrace();
     }

    }
}
