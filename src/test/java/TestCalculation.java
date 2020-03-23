import HW3.Calculation;

public class TestCalculation {
    public void testCalculation(){

        Calculation.discount(1.0);
        System.out.println(Calculation.countTicketPrice(1000,15.0));
        System.out.println(Calculation.countTicketPriceTwoSolution(1000,4.9));
    }
}
