package Main3;

public class PartTimeEmployee extends Employee{
    String role;
    int hourlyWage;
    int hoursWorked;

    public PartTimeEmployee(String role, String name, int hourlyWage, int hoursWorked){
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public String getRole(){
        return role;
    }
    @Override
    public int calculateSalary(){
        return hourlyWage * hoursWorked;
    }
}
