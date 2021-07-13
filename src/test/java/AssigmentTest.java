import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class AssigmentTest {

    @Test
    @DisplayName(" 5, 2 calculation test")
    void testFiveTwoCalculation() {
        CalculationDTO calculationDTO = Assigment.calculateData(5, 2);
        assertEquals(calculationDTO.getMultiplication(), 10, "Incorrect result for multiplication");
        assertEquals(calculationDTO.getDivision(), 2.5, "Incorrect result for division");
        assertEquals(calculationDTO.getReminderOfTheDivision(), 1, "Incorrect result for remainder of the division");
    }
}