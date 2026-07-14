package Main4;

import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class Main4 {
        public static void main(String[] args) {
            String json = "excersise.json";
        Gson gson = new Gson();

    try (FileReader reader = new FileReader(json)) {
        Employee person = gson.fromJson(reader, Employee.class);
        
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Salary: " + person.getSalary());
    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
