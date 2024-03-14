import static java.lang.Math.*;

public class Vector3 {
    private final Point3 startPoint;
    private final Point3 endPoint;

    public Point3 getStartPoint() {
        return startPoint;
    }

    public Point3 getEndPoint(){
        return endPoint;
    }

    public Vector3(Point3 start, Point3 end) throws Exception {
        this.startPoint = start;
        this.endPoint = end;
        if(Math.abs(Module()) < 0.00000001){
            throw new Exception("Null vector");
        }
    }
    public Vector3(double x1, double y1, double z1, double x2, double y2, double z2) throws Exception {
        this.startPoint = new Point3(x1, y1, z1);
        this.endPoint = new Point3(x2, y2, z2);
        if(Math.abs(Module()) < 0.00000001){
            throw new Exception("Null vector");
        }
    }

    public double Module(){
        double valueX = pow(startPoint.getX() - endPoint.getX(), 2);
        double valueY = pow(startPoint.getY() - endPoint.getY(), 2);
        double valueZ = pow(startPoint.getZ() - endPoint.getZ(), 2);
        return sqrt(valueX + valueY + valueZ);
    }

    public static Vector3 Addition(Vector3 one, Vector3 two) throws Exception {
        double newX = one.endPoint.getX() - one.startPoint.getX() + two.endPoint.getX() - two.startPoint.getX();
        double newY = one.endPoint.getY() - one.startPoint.getY() + two.endPoint.getY() - two.startPoint.getY();
        double newZ = one.endPoint.getZ() - one.startPoint.getZ() + two.endPoint.getZ() - two.startPoint.getZ();

        return new Vector3(one.startPoint.getX(), one.startPoint.getY(), one.startPoint.getZ(),
                one.startPoint.getX() + newX, one.startPoint.getY() + newY, one.startPoint.getZ() + newZ);
    }

    public static Vector3 Subtraction(Vector3 one, Vector3 two) throws Exception {
        double newX = one.endPoint.getX() - one.startPoint.getX() - (two.endPoint.getX() - two.startPoint.getX());
        double newY = one.endPoint.getY() - one.startPoint.getY() - (two.endPoint.getY() - two.startPoint.getY());
        double newZ = one.endPoint.getZ() - one.startPoint.getZ() - (two.endPoint.getZ() - two.startPoint.getZ());

        return new Vector3(one.startPoint.getX(), one.startPoint.getY(), one.startPoint.getZ(),
                one.startPoint.getX() + newX, one.startPoint.getY() + newY, one.startPoint.getZ() + newZ);
    }


    @Override
    public String toString() {
        return String.format("Vector from point{%f, %f, %f} to point{%f, %f, %f} with length %f",
                startPoint.getX(), startPoint.getY(), startPoint.getZ(),
                endPoint.getX(), endPoint.getY(), endPoint.getZ(), Module());
    }


    public static double ScalarMultiply(Vector3 one, Vector3 two){
        double oneValueX = one.endPoint.getX() - one.startPoint.getX();
        double oneValueY = one.endPoint.getY() - one.startPoint.getY();
        double oneValueZ = one.endPoint.getZ() - one.startPoint.getZ();
        double twoValueX = two.endPoint.getX() - two.startPoint.getX();
        double twoValueY = two.endPoint.getY() - two.startPoint.getY();
        double twoValueZ = two.endPoint.getZ() - two.startPoint.getZ();
        return oneValueX * twoValueX + oneValueY * twoValueY + oneValueZ * twoValueZ;
    }


    public static double Cos(Vector3 one, Vector3 two){
        return ScalarMultiply(one, two) / (one.Module() * two.Module());
    }


}