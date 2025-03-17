import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.javaqa.javaqamvn.serices.MonthVacation;

public class MonthVacationTests {
    @ParameterizedTest
    @CsvSource({"3, 10000, 20000, 3000", "2, 100000, 150000, 60000"})
    public void howManyMonths1(int expected, int income, int threshold, int expense) {
        MonthVacation service = new MonthVacation();

        //int expected = 3;
        int actual = service.calcMonthVacation(income, threshold, expense);

        Assertions.assertEquals(expected, actual);
        //System.out.println("Отпуск в году составил = " + service.calcMonthVacation(10_000, 20_000, 3_000) + " месяца/ев");

    }

    //   @Test
    //  public void howManyMonths2() {
    //      monthVacation servise = new monthVacation();
//
    //      int expected = 2;
    //       int actual = servise.calcMonthVacation(0, 100_000, 150_000, 60_000);
//
    //       Assertions.assertEquals(expected, actual);
    //       System.out.println("Отпуск в году составил = " + servise.calcMonthVacation(0, 100_000, 150_000, 60_000) + " месяца/ев");
    //  }
}
