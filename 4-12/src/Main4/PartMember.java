package Main4;

import java.util.ArrayList;
import java.util.List;

public class PartMember implements Cloneable{
    private String name;
    private List<String> skills;

    public PartMember(String name){
        this.name = name;
        this.skills = new ArrayList<>();
    }
    public void addSkill(String skill) {
        this.skills.add(skill);
    }
    public String showSkills(){
        return "[" + name + "]" + "のスキル：" + skills;
    }

    @Override
    public PartMember clone(){
        try{
            PartMember result = (PartMember) super.clone();
            result.skills =new ArrayList<>(this.skills);
            return result;
        }catch(CloneNotSupportedException error){
            throw new RuntimeException("コピー失敗");
        }
    }
}
