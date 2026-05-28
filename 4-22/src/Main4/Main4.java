package Main4;

import com.google.gson.Gson;

public class Main4 {
        public static void main(String[] args) {
            String json = "{\"name\":\"佐藤　一郎\",\"age\":35,\"salary\":\"450000\"}";
        Gson gson = new Gson();
        Employee person = gson.fromJson(json, Employee.class);
        
        // Personオブジェクトから情報を出力
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Salary: " + person.getSalary());
    }
}
