package encapsulation26;

/**
 * 26. Encapsulations example
 */
public class Encapsulate {
    //private variables declared, these can only be accessed by public method of the class
    private String name;
    private int rollNo;
    private int age;

    //get method for name to access private variable name

    public String getnName() {
        return name;
    }
    //set method for name to access private variable name

    public void setName(String name) {
        this.name = name;
    }
    //get method for roll to access private variable rollNo

    public int getRollNo() {
        return rollNo;
    } // set method for roll to access private variable rollNo

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    // get method for age to access private variable age

    public int getAge() {
        return age;
    } //set method for age to access private variable age

    public void setAge(int age) {
        this.age = age;
    }
}
