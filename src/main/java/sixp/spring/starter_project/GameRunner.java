package sixp.spring.starter_project;

public class GameRunner {
    MarioGame game;
    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: "+game );
        game.down();
        game.left();
        game.up();
        game.right();


    }
}
