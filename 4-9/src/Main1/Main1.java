package Mai1;

public class Main1 {
    public static void main(String[] args) {
        Calculator division = new Calculator();
        int num1 = 10;
        int num2 = 0;

        try{
            int result = division.divide(num1, num2);
            System.out.println(num1 + " ÷ " + num2 + " = " + result);
        }catch (ArithmeticException error){
            System.out.println(num1 + " ÷ " + num2 + " = エラー：" + error.getMessage());
        }
    }
}
