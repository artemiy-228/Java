
public class Main {

    public static void main(String[] args){
        Student[] students = new Student[5];
        students[0] = new Student("Sychev", "Artemy", "Daniilovich", 212);
        students[1] = new StudentSocialActivist("Khismatullin", "Vildan", "Vadimovich", 212, "Journalist", 1.57);
        students[2] = new StudentSportsmen("Polyantsev", "Nikita", "Sergeevich", 212, "Gym");
        students[3] = new Student("Shipkov", "Timofey", "idk", 212);
        students[4] = new Student("Sychev", "Artemy", "Daniilovich", 212);
        for(Student student : students){
            System.out.println(student);
        }
    }
}