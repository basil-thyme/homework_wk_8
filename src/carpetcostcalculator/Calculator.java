package carpetcostcalculator;
/**3. Write a class with the name Calculator. The class needs two fields (instance variables) with name
 floor of type Floor and carpet of type Carpet.
 The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet
 and it needs to initialize the fields.
 Write the following methods (instance methods):
 ● Method named getTotalCost without any parameters, it needs to return the calculated total
 cost to cover the floor with a carpet.*/
public class Calculator {

    double floor;
    double carpet;
    double totalCost;

    public Calculator(double floor, double carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return (this.totalCost = this.carpet * this.floor);

    }

}
