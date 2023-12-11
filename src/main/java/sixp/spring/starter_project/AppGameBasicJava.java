package sixp.spring.starter_project;

public class AppGameBasicJava {
    public static void main(String[] args) {

        var mariogame = new MarioGame();
        var gameRunner = new GameRunner(mariogame);
        gameRunner.run();


    }
}








