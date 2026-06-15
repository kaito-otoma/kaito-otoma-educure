package Main3;

public abstract class Employee {
    String name;
    String role;

    public Employee(String name, String role){
        this.name = name;
        this.role = role;
    }

    public String getName (){
        return this.name;
    }

    public String getRole(){
    return this.role;
    }

    public abstract int calculateSalary();
}
