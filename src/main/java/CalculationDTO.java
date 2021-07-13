public class CalculationDTO {
    public CalculationDTO() {
    }

    private int multiplication;
    private double division;
    private int reminderOfTheDivision;

    public int getMultiplication() {
        return multiplication;
    }

    public double getDivision() {
        return division;
    }

    public int getReminderOfTheDivision() {
        return reminderOfTheDivision;
    }


    public CalculationDTO multiplication(int multiplication) {
        this.multiplication = multiplication;
        return this;
    }

    public CalculationDTO division(double division) {
        this.division = division;
        return this;
    }

    public CalculationDTO reminderOfTheDivision(int reminderOfTheDivision) {
        this.reminderOfTheDivision = reminderOfTheDivision;
        return this;
    }
}
