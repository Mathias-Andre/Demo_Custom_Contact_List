package sg.edu.rp.c346.id19031965.democustomcontactlist;

public class Contact {

    // this is a template, doesn't contain specific data
    private String name;
    private int countryCode;
    private int phoneNum;
    private char gender;

    // constructor - name is the same as the class name

    //fields
    public Contact(String name, int countryCode, int phoneNum, char gender) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getCountryCode() {

        return countryCode;
    }

    public void setCountryCode(int countryCode) {

        this.countryCode = countryCode;
    }

    public int getPhoneNum() {

        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {

        this.phoneNum = phoneNum;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
