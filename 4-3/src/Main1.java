public class Main1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String word = str1 + str2;
        String pickUp  = word.substring(2, 7);

        System.out.println("元の文字列1：" + str1);
        System.out.println("元の文字列2：" + str2);
        System.out.println("連結後：" + word);
        System.out.println("部分文字列(3-7):" + pickUp);
    }
}
