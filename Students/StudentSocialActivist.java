public class StudentSocialActivist extends Student{

    private String socialWork;
    private double scholarShipCoeff;

    public String getSocialWork() {return socialWork;}
    public double getScholarShipCoeff() {return scholarShipCoeff;}

    StudentSocialActivist(String familyName, String givenName,String middleName, int groupNumber, String socialWork, double scholarShipCoeff) {
        super(familyName,givenName,middleName, groupNumber);
        this.socialWork = socialWork;
        this.scholarShipCoeff = scholarShipCoeff;
    }
    @Override
    public String toString() {
        String text1 = super.toString();
        String text2 = "\nThis student is social activist and works in %s;\nStudent gets scholarship with coefficient %.2f";
        return text1 + String.format(text2, socialWork, scholarShipCoeff);
    }
}
