package Main3;

public abstract class Employee {
    String name;
    abstract String  role();

    public Employee(String name){
        this.name = name;
    }

    public String getName (){
        return this.name;
    }

    public String getRole(){
        if(role().equals("PartTimeEmployee")){
            return "パートタイム";
    }else if(role().equals("RegularEmployee")){
            return "正社員";
    }
        return "その他";
}
    public abstract int calculateSalary();
}
