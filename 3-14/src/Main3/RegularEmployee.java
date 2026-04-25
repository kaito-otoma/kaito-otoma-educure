package Main3;

public class RegularEmployee extends Employee {
    int baseSalary;

    public RegularEmployee(String name, int baseSalary){
        super(name);
        this.baseSalary = baseSalary;
    }
    @Override
    public String getRole(){
        return"";
    }
     @Override
    public int calculateSalary() {
        return baseSalary;
    }
}