package Main3;

public class Character implements Comparable<Character>{
    private String name;
    private int hp;
    private int Power;

    public Character (String name, int hp, int Power){
        this.name = name;
        this.hp = hp;
        this.Power = Power;
    }
    public int getBattlePower(){
        return hp + Power;
    }
    @Override
    public int compareTo(Character other) {
        return Integer.compare(this.getBattlePower(), other.getBattlePower());
    }

    @Override
    public String toString(){
        return this.name + "(HP:" + this.hp + "攻撃力:" + this.Power + ")";
    }
}
