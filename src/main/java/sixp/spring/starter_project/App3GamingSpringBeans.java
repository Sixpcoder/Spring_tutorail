package sixp.spring.starter_project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sixp.spring.starter_project.coupling.GameRunner;
import sixp.spring.starter_project.coupling.GamingConsole;
import sixp.spring.starter_project.coupling.MarioGame;
import sixp.spring.starter_project.coupling.Pacman;

public class App3GamingSpringBeans {

    public static void main(String[] args) {

     try(   var context = new AnnotationConfigApplicationContext
             (Gamingconfiguration.class)) {
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
