public class Main2 {
    public static String shortenMessage(String message, int maxLength) {
      if (message == null || message.length() <= maxLength) {
            return message;
        }
        StringBuilder shortenMessage = new StringBuilder();
        shortenMessage.append(message, 0, maxLength).append("...");
        return shortenMessage.toString();
    }
    public static void main(String[] args) {
        String message = "これは非常に長いチャットメッセージです。省略する必要があります。";
        System.out.println("原文: " + message);
        System.out.println("省略後(10文字): " + shortenMessage(message, 10));
        System.out.println("省略後(20文字): " + shortenMessage(message, 20));
    }
}
