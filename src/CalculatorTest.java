//import static org.junit.Assert.assertEquals;
//import org.junit.Test;
//
//public class CalculatorTest{
//    @Test
//    public void calculatorInitialValueZero(){
//        Calculator calculator = new Calculator();
//        assertEquals(0,calculator.getValue());
//    }
//
//    @Test
//    public void valueFiveWhenFiveAdded() {
//        Calculator calculator = new Calculator();
//        calculator.add(5);
//        assertEquals(5, calculator.getValue());
//    }
//
//    @Test
//    public void valueMinusTwoWhenTwoSubstracted() {
//        Calculator calculator = new Calculator();
//        calculator.subtract(2);
//        assertEquals(-2, calculator.getValue());
//    }
//}
//
//class Calculator{
//    private int value;
//
//    public Calculator() {
//        this.value = 0;
//    }
//
//    public void add(int number) {
//        this.value = this.value + number;
//    }
//
//    public void subtract(int number) {
//        this.value = this.value - number;
//    }
//
//    public int getValue() {
//        return this.value;
//    }
//}
