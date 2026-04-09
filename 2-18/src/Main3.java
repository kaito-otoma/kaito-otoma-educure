public class Main3 {
    public static void main(String[] args) {
        String input = "Hello";

        wordReverse(input);
    }
    public static void wordReverse(String output){
        String result = new StringBuilder(output).reverse().toString();
        System.out.println(result);
    }
}
