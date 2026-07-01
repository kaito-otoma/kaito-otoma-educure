package Main4;

import java.util.ArrayList;
import java.util.List;

public class PartyMember implements Cloneable{
    private String name;
    private List<String> skills;

    public PartyMember(String name){
        this.name = name;
        this.skills = new ArrayList<>();
    }
    public void addSkill(String skill) {
        this.skills.add(skill);
    }
    public void showSkills(){
        System.out.println("[" + name + "]" + "のスキル：" + skills);
    }

    @Override
    public PartyMember clone(){
        try{
            PartyMember result = (PartyMember) super.clone();
            result.skills =new ArrayList<>(this.skills);
            return result;
        }catch(CloneNotSupportedException error){
            throw new RuntimeException("コピー失敗");
        }
    }
}
