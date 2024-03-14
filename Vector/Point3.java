
public class Point3 {
    private double x;
    public double getX() {return x;}
    private double y;
    public double getY() {return y;}
    private double z;
    public double getZ() {return z;}

    public Point3(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString(){
        String text = "Point {%2.f, %2.f, %2.f}";
        return String.format(text, x, y, z);
    }
}

