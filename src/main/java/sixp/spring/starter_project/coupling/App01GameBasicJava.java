package sixp.spring.starter_project.coupling;

public class App01GameBasicJava {
    public static void main(String[] args) {

        var game = new MarioGame();

        var pacman  = new  Pacman();//step 1object creation
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(pacman);
        //object creation + wiring of dependencies
        // game is a dependency of gamerunner
        gameRunner.run();


    }
}








