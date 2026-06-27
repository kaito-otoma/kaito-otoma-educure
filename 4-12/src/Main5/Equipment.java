package Main5;

import java.util.Objects;

public class Equipment implements Cloneable, Comparable<Equipment>{
    private String name;
    private int power;
    private int guard;

    public Equipment(String name, int power, int guard){
        this.name = name;
        this.power = power;
        this.guard = guard;
    }
    public int getPower(){
        return this.power + this.guard;
    }
    @Override
    public Equipment clone() {
        try{
            Equipment weapon = (Equipment) super.clone();
            return weapon;
        }catch (CloneNotSupportedException error){
            throw new AssertionError();
        }
    }
    @Override
    public boolean equals(Object clones){
        if (this == clones) return true;
        if (clones == null)return false;
        Equipment other = (Equipment) clones;
        return power == other.power &&
               guard == other.guard &&
               Objects.equals(name, other.name);
        }

    @Override
    public int compareTo(Equipment other) {
        return Integer.compare(other.getPower(), this.getPower());
    }
    @Override
    public String toString(){
        return this.name + "(攻撃力:" + this.power + "防御力:" + this.guard + ")";
    }
}
