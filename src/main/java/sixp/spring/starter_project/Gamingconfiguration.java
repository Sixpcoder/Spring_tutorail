package sixp.spring.starter_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sixp.spring.starter_project.coupling.GameRunner;
import sixp.spring.starter_project.coupling.GamingConsole;
import sixp.spring.starter_project.coupling.MarioGame;
import sixp.spring.starter_project.coupling.Pacman;

@Configuration
public class Gamingconfiguration {

//    var game = new MarioGame();
//
//    var pacman  = new Pacman();//step 1object creation
//    //        var game = new SuperContraGame();
//    var gameRunner = new GameRunner(game);
//    //object creation + wiring of dependencies
//    // game is a dependency of gamerunner
//        gameRunner.run();

    @Bean
    public GamingConsole game(){
        var game  = new Pacman();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return  gameRunner;
    }



}
