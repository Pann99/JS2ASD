public class Dragon23 {
    private int x, y, width, height;

    public Dragon23(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        if (x - 1 >= 0) {
            x--;
        } else {
            detectCollision(x - 1, y);
        }
    }

    public void moveRight() {
        if (x + 1 < width) {
            x++;
        } else {
            detectCollision(x + 1, y);
        }
    }

    public void moveUp() {
        if (y - 1 >= 0) {
            y--;
        } else {
            detectCollision(x, y - 1);
        }
    }

    public void moveDown() {
        if (y + 1 < height) {
            y++;
        } else {
            detectCollision(x, y + 1);
        }
    }

    public void detectCollision(int x, int y) {
        System.out.println("Game Over");
    }

    public void printPosition() {
        System.out.println("Dragon position: (" + x + ", " + y+")");
    }

}