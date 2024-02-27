public class DragonMain23 {
    public static void main(String[] args) {
       
        Dragon23 dragon = new Dragon23(5, 5, 10, 10);

        
        dragon.printPosition();

        dragon.moveLeft();
        dragon.printPosition();

        dragon.moveUp();
        dragon.printPosition();

        dragon.moveRight();
        dragon.printPosition();

        dragon.moveDown();
        dragon.printPosition();

        dragon.moveLeft();
        dragon.printPosition();
    }
}