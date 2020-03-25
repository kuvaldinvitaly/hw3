/**
 * Код писать здесь
 */
public class Test {
    public static void main(String[] args) {
        TestCalculation tc = new TestCalculation();
        try {
            tc.testCalculation();
        } catch (Exception e) {
            e.printStackTrace();
        }

        TestEmployeeCard tec = new TestEmployeeCard();
        try {
            tec.testEmployeeCard();
        } catch (Exception e) {
            e.printStackTrace();
        }

        TestIndividualWork tiv = new TestIndividualWork();
        tiv.testIndividualWork();
    }


    }
    
