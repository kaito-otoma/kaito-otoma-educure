package Main2;

public class Monster {
    private String name;
    private int level;

    public Monster(String name, int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return this.name + "Lv." + this.level;
    }

    @Override
    public boolean equals(Object monsters){
        if (monsters == this) return true;
        if (monsters == null) return false;

        Monster other = (Monster)monsters;
        return this.name.equals(other.name) &&
                this.level == other.level;
            
    
    }
}
