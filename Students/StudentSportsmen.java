
class StudentSportsmen extends Student{

    private String sportName;
    public String getSportName() { return sportName;}
    public StudentSportsmen(String familyName, String givenName,String middleName, int groupNumber, String sportName){
        super(familyName, givenName, middleName, groupNumber);
        this.sportName = sportName;
    }
    @Override
    public String toString() {
        String text1 = super.toString();
        String text2 = "\nThis student is sportsmen and does in %s;";
        return text1 + String.format(text2, sportName);
    }
}