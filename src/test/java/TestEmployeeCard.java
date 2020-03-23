import HW3.EmployeeCard;

public class TestEmployeeCard {
    public void testEmloyeeCard(){
        EmployeeCard employeeCard = new EmployeeCard("qwerty",25,15.0,true);
        EmployeeCard employeeCard1 = new EmployeeCard("asdfg",78,88.0,false);
        System.out.println(employeeCard.toString());
        System.out.println(employeeCard1.toString());

    }
}
