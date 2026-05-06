public class Main3 {
    public static boolean validateUsername(String username) {
        String name = "^(?![0-9]+$)[a-zA-Z0-9_]{4,16}$";
        return username.matches(name);
    }

    public static boolean validatePassword(String password) {
        String pass = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
        return password.matches(pass);
    }

    public static void main(String[] args) {
        // テストケース
        String[] usernames = {"Player_1", "123456", "P@layer"};
        String[] passwords = {"Password123", "password123", "Pass"};
        
        System.out.println("ユーザー名チェック：");
        for(String name : usernames){
            if (validateUsername(name)) {
                System.out.println(name + ":有効");
            }else{
                System.out.println(name + ":無効");
                }
            }
        System.out.println("パスワードチェック：");
        for (String pass : passwords){
            if (validatePassword(pass)) {
                System.out.println(pass + ":有効");
            }else{
                System.out.println(pass + ":無効");

            }
        }
    }
}
