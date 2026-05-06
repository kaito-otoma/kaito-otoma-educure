import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();  // 数を決めなくてもよい
        students.add("田中");
        students.add("佐藤");
        students.add("鈴木");     
        
        System.out.println("学生リスト：" + students);
        
        String student = students.get(1);
        System.out.println("2番目の学生：" + student);
        
        int count = students.size();
        System.out.println("学生数：" + count);
        
        boolean pick = students.contains("鈴木");
        System.out.println("鈴木さんは含まれていますか：" + pick);

    }
}