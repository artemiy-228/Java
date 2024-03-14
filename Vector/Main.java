
public class Main {


    public static void main(String[] args) throws Exception {
        Vector3 vector = new Vector3(0, 0, 0, 1, 1, 1);
        Vector3 vector2 = new Vector3(0, 0, 0, -1, -1, -1);
        try{
            Vector3 vector3 = Vector3.Addition(vector, vector2);
            System.out.println(vector3);
        }
        catch(Exception e){
            System.out.println("Created null vector!");
        }
        System.out.println(Vector3.Cos(vector, vector2));
    }
}