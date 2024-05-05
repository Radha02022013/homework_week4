package encapsulation26;

/**
 * 26.main
 */
public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate E = new Encapsulate(); //Setting value of the variables
        E.setName("Megh");
        E.setAge(4);
        E.setRollNo(13);
        // Displaying values of the variables
        System.out.println("Prime's name:" + E.getnName());
        System.out.println("Prime's age:" + E.getAge());
        System.out.println("Prime's rollNo::" + E.getRollNo());

        //Direct access of rollNo is not possible due to encapsulation
        //System.out.println("Prime's rollNo:" + E.geekName);
    }
}
