package HW3;

public class Calculation {
    /**
     * Метод рассчета скидки, взависимости от зарпалты в час.
     * Чем больше зарплата - тем меньше скидка
     *
     * @param salary - зарплата
     */
    public static double discount(double salary) {
//        if (salary < 15.0) {
//            System.out.println("Скидка составляет - 15%");
//        } else if (salary < 12.0) {
//            System.out.println("Скидка составляет - 20%");
//        } else if (salary < 5.0) {
//            System.out.println("Скидка составляет - 30%");
//        }
//        System.out.println("Скидки не будет!");
        double discount_second = 0.0;

        if (salary > 0 && salary < 5.0) {
            System.out.println("Скидка составляет - 30%");
            discount_second = 30.0;
        } else if (salary > 0 && salary < 12.0) {
            System.out.println("Скидка составляет - 20%");
            discount_second = 20.0;
        } else if (salary > 0 && salary < 15.0) {
            System.out.println("Скидка составляет - 15%");
            discount_second = 15.0;
        } else System.out.println("Скидки не будет!");

        return discount_second;

        // Посчитайте скидку с разными параметрами. Выведите корректную скидку на экран.

        // Метод discount переделан для вывода реальной скидки

    }

    /**
     * Метод рассчета стоимости билета со скидкой.
     * Для рассчета скидки, используйте метод discount
     *
     * @param ticketPrice - стоимость билета
     * @param discount    - скидка
     * @return стоимость билета со скидкой
     */
    public static double countTicketPrice(int ticketPrice, double discount) {

        return (double) ticketPrice - (ticketPrice * discount * 0.01);

    }
    // Метод должен корректно считать окончательную стоимость билета

    // Расчет скидки по ЗП:

    public static double countTicketPriceTwoSolution(int ticketPrice, double salary){
        double discount = discount(salary);
        return (double) ticketPrice - (ticketPrice * discount * 0.01);
    }

}
