public class Calculator implements java.io.Serializable{
    private double operandOne = 0;
    private double operandTwo = 0;
    private String operation = "";
    private double result = 0;
    public Calculator(){
    }
    public void setOperandOne(double num) {
        this.operandOne = num;
    }
    public double getOperandOne() {
        System.out.println(operandOne);
        return this.operandOne;
    }
    public void setOperandTwo(double num) {
        this.operandTwo = num;
    }
    public double getOperandTwo() {
        System.out.println(operandTwo);
        return this.operandTwo;
    }
    public void setOperation(String operation) {
        if (operation == "-" || operation == "+") {
            this.operation = operation;
        }
        else {
            System.out.println("Only + or - operations supported");
        }
    }
    public String getOperation() {
        System.out.println("Operation: " + operation);
        return this.operation;
    }
    public double performOperation() {
        if (getOperation() == "+") {
            System.out.println("Adding " + operandOne + " to " + operandTwo);
            return this.result = (operandOne + operandTwo);
        }
        else if (getOperation() == "-") {
            System.out.println("Subracting " + operandTwo + " from " + operandOne);
            return this.result = (operandOne - operandTwo);
        }
        else {
            System.out.println("Operation not supported");
            return this.result = 0;
        }
    }
    public double getResult() {
        System.out.println("Result: " + this.result);
        return this.result;
    }
}
