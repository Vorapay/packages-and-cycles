import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.javaqa.javaqamvn.serices.monthVacation;

public class monthVacationTests {
    @Test
    public void howManyMonths1() {
        monthVacation servise = new monthVacation();

        int expected = 3;
        int actual = servise.calcMonthVacation(0, 10_000, 20_000, 3_000);

        Assertions.assertEquals(expected, actual);
        System.out.println("Отпуск в году составил = " + servise.calcMonthVacation(0, 10_000, 20_000, 3_000) + " месяца/ев");

    }

    @Test
    public void howManyMonths2() {
        monthVacation servise = new monthVacation();

        int expected = 2;
        int actual = servise.calcMonthVacation(0, 100_000, 150_000, 60_000);

        Assertions.assertEquals(expected, actual);
        System.out.println("Отпуск в году составил = " + servise.calcMonthVacation(0, 100_000, 150_000, 60_000) + " месяца/ев");
    }
}
