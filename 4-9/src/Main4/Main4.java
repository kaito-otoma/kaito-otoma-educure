package Main4;

public class Main4 {
     public static void main(String[] args) {
        StudentManager list = new StudentManager();
        
        list.addStudent("アリス");
        list.addStudent("ボブ");
        list.addStudent("チャーリー");
        list.addStudent(null);
        list.addStudent("イヴ");

        list.addStudent("マイケル");

        System.out.println("学生ID 2:" + list.getStudent(2));

        System.out.println("学生ID 3: " + list.getStudent(3));

        list.updateStudent(10, "a");

        System.out.println("学生ID 10:" + list.getStudent(10));
        
        list.updateStudent(1, "ボビー");
        System.out.println("更新後の学生ID 1" + list.getStudent(1));

        list.updateStudent(0, "フランク");

        list.updateStudent(10, "a");

    }
}
