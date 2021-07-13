
public class Assigment {

    public Assigment() {
    }

    public static CalculationDTO calculateData(int x, int y) {
        return new CalculationDTO()
                .multiplication(x * y)
                .division((double) x / (double) y)
                .reminderOfTheDivision(x % y);
    }

}
