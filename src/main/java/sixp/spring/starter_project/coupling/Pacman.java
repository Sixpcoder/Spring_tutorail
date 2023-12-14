package sixp.spring.starter_project.coupling;

import org.springframework.stereotype.Component;

@Component
public class Pacman implements  GamingConsole {
    @Override
    public void up() {
        System.out.println(" yo");
    }

    @Override
    public void down() {
        System.out.println("hello");
    }

    @Override
    public void left() {
        System.out.println("bye");

    }

    @Override
    public void right() {
        System.out.println("meet again");

    }
}
