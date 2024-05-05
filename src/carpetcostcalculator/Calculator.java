package carpetcostcalculator;

/**
 * 17. Write a class with the name Calculator. The class needs two fields (instance variables) with name
 * floor of type Floor and carpet of type Carpet.
 * The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet
 * and it needs to initialize the fields.
 * Write the following methods (instance methods):
 * ● Method named getTotalCost without any parameters, it needs to return the calculated total
 * cost to cover the floor with a carpet.
 */
public class Calculator {
    //instance variable
    Floor floor;
    Carpet carpet;

    //constructor with parameter
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    //method name without parameter with return type
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
