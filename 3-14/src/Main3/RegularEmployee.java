package Main3;

public class RegularEmployee extends Employee {
    int baseSalary;

    public RegularEmployee(String name, int baseSalary){
        super(name, "正社員");
        this.baseSalary = baseSalary;
    }
    
     @Override
    public int calculateSalary() {
        return baseSalary;
    }
}