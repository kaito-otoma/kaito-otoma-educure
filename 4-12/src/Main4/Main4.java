package Main4;

public class Main4 {
    public static void main(String[] args) {
        PartyMember chara = new PartyMember("アリス");
        chara.addSkill("ファイア");
        chara.addSkill("ブリザード");

        PartyMember charaCopy = chara.clone();
        charaCopy.addSkill("サンダー");

        System.out.println("--- 深いコピー後にスキル追加 ---");
        System.out.print("元のキャラクター");
        chara.showSkills();
        System.out.print("コピーしたキャラクター");
        charaCopy.showSkills();
    }
}
