package Main4;

public class Main4 {
    public static void main(String[] args) {
        PartMember chara = new PartMember("アリス");
        chara.addSkill("ファイア");
        chara.addSkill("ブリザード");

        PartMember charaCopy = chara.clone();
        charaCopy.addSkill("サンダー");

        System.out.println("--- 深いコピー後にスキル追加 ---");
        System.out.println("元の" + chara.showSkills());
        System.out.println("コピーした" + charaCopy.showSkills());
    }
}
