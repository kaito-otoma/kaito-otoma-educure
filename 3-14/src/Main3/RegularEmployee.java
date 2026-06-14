package Main3;

public class RegularEmployee extends Employee {
    String role;
    int baseSalary;

    public RegularEmployee(String role, String name, int baseSalary){
        super(name);
        this.baseSalary = baseSalary;
    }
    @Override
    public String getRole(){
        return role;
    }
     @Override
    public int calculateSalary() {
        return baseSalary;
    }
}