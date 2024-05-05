package homework_week4_maninisheth;

/**
 * 15. Display left angle triangle of * using nested for loops
 */
public class LeftAngleTraingle {

public static void main(String[] args) {
    int rows = 5; // Number of rows in the triangle

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line after printing each row
    }
}
}
