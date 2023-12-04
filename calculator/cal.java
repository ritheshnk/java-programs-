public class cal {
    private double firstNumber;
    private int secondNumber;

    public void setFirstNumber(double num) {
        this.firstNumber = num;
    }

    public void setSecondNumber(int num) {
        this.secondNumber = num;
    }


    public double calculateAdd() {
        return (firstNumber + secondNumber);
    }

    public double calculateSub() {
        return (firstNumber - secondNumber);
    }

    public double calculateMultiply() {
        return (firstNumber * secondNumber);
    }

    public double calculatedivide() {
        return (firstNumber / secondNumber);
    }
}
