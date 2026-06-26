package Main4;

public class StudentManager {
    private String[] students = new String[5];
    private int count = 0;
    
    public void addStudent(String name) {
        try{
            if (count < students.length) {
                students[count] = name;
                count++;
            } else {
                throw new IllegalStateException("エラー：これ以上生徒を追加できません。リストがいっぱいです。");
            }
        } catch (IllegalStateException error) {
            System.out.println(error.getMessage());
        }
    }
    
    public String getStudent(int id) {
        try{
            if (id < 0 || id >= students.length || students[id] == null) {
                throw new IllegalStateException("エラー：学生ID" + id + "にデータがありません。");
            }
                return students[id];
        } catch (IllegalStateException error) {
            System.out.println(error.getMessage());
            return null;
        }
    }

    public String updateStudent(int id, String name) {
        try{
            if (id < 0 || id >= count) {
                throw new IllegalStateException("エラー：無効な学生IDです：" + id);
        }
            students[id] = name;
            return name;

        } catch (IllegalStateException error) {
            System.out.println(error.getMessage());
            return null;
        }
    }
}
