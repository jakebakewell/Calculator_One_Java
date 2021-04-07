public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setOperandOne(5);
        calc.setOperandTwo(13.7);
        calc.setOperation("+");
        calc.performOperation();
        calc.getResult();
    }
}
