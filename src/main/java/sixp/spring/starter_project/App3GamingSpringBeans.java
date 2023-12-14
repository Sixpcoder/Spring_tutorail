package sixp.spring.starter_project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import sixp.spring.starter_project.coupling.GameRunner;
import sixp.spring.starter_project.coupling.GamingConsole;
import sixp.spring.starter_project.coupling.Pacman;
@Configuration
@ComponentScan("sixp.spring.starter_project.coupling")
public class App3GamingSpringBeans {

    public static void main(String[] args) {

     try(   var context = new AnnotationConfigApplicationContext
             (App3GamingSpringBeans.class)) {
         context.getBean(GamingConsole.class).up();
         context.getBean(GameRunner.class).run();
     }
//
//        var game = new MarioGame();
//
//        var pacman  = new Pacman();//step 1object creation
////        var game = new SuperContraGame();
//        var gameRunner = new GameRunner(pacman);
//        //object creation + wiring of dependencies
//        // game is a dependency of gamerunner
//        gameRunner.run();



    }
}

@Configuration
class gamingconfiguration {

//    var game = new MarioGame();
//
//    var pacman  = new Pacman();//step 1object creation
//    //        var game = new SuperContraGame();
//    var gameRunner = new GameRunner(game);
//    //object creation + wiring of dependencies
//    // game is a dependency of gamerunner
//        gameRunner.run();



}
