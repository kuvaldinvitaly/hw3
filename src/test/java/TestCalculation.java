import HW3.Calculation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculation {

    private Calculation calc = new Calculation();

    @Test
    public void testCalculation() throws Exception{
        System.out.println("Тестируем метод discount класса Calculation");
        testDiscount(9.0,20.0);
        testDiscount(14,15.0);
        testDiscount(2.0, 30);
        System.out.println(" ");

        System.out.println("Тестируем метод countTicketPrice(первый вариант) класса Calculation");
        testCountTicketPrice(1000, 20.0, 800);
        testCountTicketPrice(100,79,21);
        System.out.println(" ");

        System.out.println("Тестируем метод countTicketPriceTwoSolution класса Calculation");
        testCountTicketPriceTwoSolution(1000,14.0,850);
        testCountTicketPriceTwoSolution(500, 2.0,350);
        System.out.println(" ");

    }

    public void testDiscount(double salary, double discountTest){
        double result = 0;
        result = calc.discount(salary);
        Assert.assertEquals(result, discountTest, "Тест не пройден");
        System.out.println("Тест пройден т.к. при ЗП " + salary + " скидка будет равна " + result + " %" );
    }

    public void testCountTicketPrice( int ticketPrice, double discount, double ticketPriceAfterDiscount){
        double result = 0;
        result = calc.countTicketPrice(ticketPrice,discount);
        Assert.assertEquals(result, ticketPriceAfterDiscount, "Тест не пройден");
        System.out.println("Тест пройден, т.к. при скидкe " + discount + " % стоимость билета от начальной цены в " + ticketPrice + " будет равна " + ticketPriceAfterDiscount);
    }

    public void testCountTicketPriceTwoSolution (int ticketPrice, double salary, double ticketPriceAfterDiscount){
        double result = 0;
        result = calc.countTicketPriceTwoSolution(ticketPrice, salary);
        Assert.assertEquals(result, ticketPriceAfterDiscount, "Тест не пройден");
        System.out.println("Тест пройден, т.к. при ЗП в " + salary + " в час, скидка от начальной цены в " + ticketPrice + " будет равна " + ticketPriceAfterDiscount);
    }

}


