package Main2;

public class Main2 {
    public static void main(String[] args) {
    Student student = new Student(1001, "田中太郎");
    Student student2 = new Student(1001, "田中太郎");
    Student student3 = new Student(1002, "佐藤花子");

    
    System.out.println(student.equals(student2)? "同一の学生です" : "違う学生です");
    System.out.println(student.equals(student3)? "同一の学生です" : "違う学生です");
    }
}
