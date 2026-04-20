public class Main3 {
    public static void main(String[] args) {
        String input = "Hello";
        String reversed = wordReverse(input);
        System.out.println(reversed);
    }

    public static String wordReverse(String output){
        String reversed = new StringBuilder(output).reverse().toString();
        return reversed;

    }
}