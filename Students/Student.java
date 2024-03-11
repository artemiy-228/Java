public class Student {
    // Attributes of class Student
    private String firstName;
    private String lastName;
    private String middleName;
    private int groupNumber;

    //Getters for private Attributes
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getMiddleName() { return middleName; }
    public int getGroupNumber() { return groupNumber;}

    //Main constructor
    public Student(String familyName, String givenName,String middleName, int groupNumber) {
        this.lastName = familyName;
        this.firstName = givenName;
        this.middleName = middleName;
        this.groupNumber = groupNumber;
    }
    //Method for displaying information about a class object
    @Override
    public String toString() {
        String text = "{\nStudent Name: %s %s %s;\nGroup Number: %d;\n}";
        return String.format(text, lastName, firstName, middleName, groupNumber);
    }
}