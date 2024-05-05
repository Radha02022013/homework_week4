package homework_week4_maninisheth;

/**
 * 18.Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 * names firstNumber and secondNumber both of type double.
 */
public class SimpleCalculator {

    // instance variables
    double firstNumber;
    double secondNumber;

    //Method named getFirstNumber without any parameters, it needs to return the value of the
    //firstNumber field.
    public double getFirstNumber() {
        return firstNumber;
    }

    //Method named getSecondNumber without any parameters, it needs to return the value of
    //the secondNumber field.
    public double getSecondNumber() {
        return secondNumber;
    }

    //Method named setFirstNumber with one parameter of type double, it needs to set the value
    //of the firstNumber field.
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    //Method named setSecondNumber with one parameter of type double, it needs to set the
    //value of the secondNumber field.
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    //Method named getAdditionResult without any parameters, it needs to return the result of
//adding the field values of firstNumber and secondNumber.
    public double getAdditionResult() {
        double result = (firstNumber + secondNumber);
        System.out.println(result);
        return result;
    }

    // Method named getSubtractionResult without any parameters, it needs to return the result of
//subtracting the field values of the secondNumber from the firstNumber.
    public double getSubtractionResult() {
        return (firstNumber - secondNumber);
    }

    //Method named getMultiplicationResult without any parameters, it needs to return the result
//of multiplying the field values of firstNumber and secondNumber.
    public double getMultiplicationResult() {
        return (firstNumber * secondNumber);
    }

    //Method named getDivisionResult without any parameters, it needs to return the result of
//dividing the field values of firstNumber by the secondNumber. In case the value of
//secondNumber is 0 then return 0.
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return (firstNumber / secondNumber);
    }

    //main method
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);
        System.out.println("add= " + simpleCalculator.getAdditionResult());
        System.out.println("subtract= " + simpleCalculator.getSubtractionResult());
        simpleCalculator.setFirstNumber(5.25);
        simpleCalculator.setSecondNumber(0);
        System.out.println("multiply= " + simpleCalculator.getMultiplicationResult());
        System.out.println("divide= " + simpleCalculator.getDivisionResult());


    }


}
