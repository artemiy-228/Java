public class Robot {
    int x;
    int y;
    Direction dir;

    public Robot (int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void PrintInfo(){
        System.out.println(x + " " + y);
    }

    public Direction getDirection() {return dir;}

    public int getX() {return x;}

    public int getY() {return y;}

    public void turnLeft() {
        if      (dir == Direction.UP)    {dir = Direction.LEFT;}
        else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
        else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
        else if (dir == Direction.RIGHT) {dir = Direction.UP;}
    }

    public void turnRight() {
        if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
        else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
        else if (dir == Direction.LEFT)  {dir = Direction.UP;}
        else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
    }

    public void stepForward() {
        if (dir == Direction.UP)    {y++;}
        if (dir == Direction.DOWN)  {y--;}
        if (dir == Direction.LEFT)  {x--;}
        if (dir == Direction.RIGHT) {x++;}
    }
    public static void moveRobot(Robot robot, int toX, int toY) {
        Direction dx = toX >= robot.getX()? Direction.RIGHT : Direction.LEFT;
        Direction dy = toY >= robot.getY()? Direction.UP : Direction.DOWN;
        while(robot.getDirection() != dy){
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
        while(robot.getDirection() != dx){
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }
}
