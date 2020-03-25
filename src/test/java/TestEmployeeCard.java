import HW3.EmployeeCard;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.v6.A;

public class TestEmployeeCard {


    @Test
    public void testEmployeeCard() throws Exception{
        System.out.println("Тестируем метод toString класса EmployeeCard");
        testToString("Антон", 25, 35.0, false);
        testToString("Елена", 10, 0.0, true);
        testToString("Женя", 46, 27.0, false);
        System.out.println(" ");
    }

    public void testToString(String name, int age, double salary, boolean sex){
        String resultInMethod = "Имя работника - " + name + ". Его возраст - " + age + " лет. Его зарплата - " + salary + " в час. Пол - " + ((sex) ? "Женский" : "Мужской");
        String resultInTest  = new EmployeeCard(name, age, salary, sex).toString();
        System.out.println(resultInMethod);
        Assert.assertEquals(resultInMethod,resultInTest, "Test не пройден");
        System.out.println("Тест пройден, все параметры совпадают " + resultInTest);
    }



}
