package Main3;

public class PartTimeEmployee extends Employee{
    int hourlyWage;
    int hoursWorked;

    public PartTimeEmployee(String name, int hourlyWage, int hoursWorked){
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public String getRole(){
        return"";
    }
    @Override
    public int calculateSalary(){
        return hourlyWage * hoursWorked;
    }
}
