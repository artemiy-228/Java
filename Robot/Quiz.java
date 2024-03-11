import java.math.BigInteger;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quiz {
    public static void main(String[] args){
        Robot robot = new Robot(0, 0, Direction.UP);
        robot.PrintInfo();
        Robot.moveRobot(robot, 6, -3);
        robot.PrintInfo();
    }
}

