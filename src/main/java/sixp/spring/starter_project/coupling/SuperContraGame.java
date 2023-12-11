package sixp.spring.starter_project.coupling;

public class SuperContraGame implements  GamingConsole{
    @Override
    public void up() {
        System.out.println( "up");
    }

    @Override
    public void down() {
        System.out.println("Go down");
    }

    @Override
    public void left() {
        System.out.println("go left");
    }

    @Override
    public void right() {
        System.out.println("accelerate");
    }


// tighly coupled code
   /* public void up(){
        System.out.println( "up");
    }

    public void down(){
        System.out.println("Go down");

    }

    public void left(){
        System.out.println("go left");

    }

    public void right(){
        System.out.println("accelerate");

    }*/

}
