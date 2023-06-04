package chapter17.example2;

public class Main {
    public static void main(String[] args) {

        CalculatorForm calculatorForm = new CalculatorForm();
        calculatorForm.computeAdd(1);
        calculatorForm.computeAdd(5);
        // calculatorForm.computeSub(2);
        // calculatorForm.computeDiv(2);


        calculatorForm.undo();
    }
}
