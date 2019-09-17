import com.enigma.model.Heroes;
import com.enigma.model.Skill;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        Skill jump = new Skill("jump",22,33);
        //=========================LIST================
        List<Heroes> ninjak = new ArrayList<>();
        ninjak.add(new Heroes("dedy",55,55,55,jump));
        ninjak.add(new Heroes("dedy",88,55,55,jump));
        System.out.println(ninjak.size());
        Heroes dedy = new Heroes("dedy",67,55,55,jump);
        System.out.println("ini datanya : "+ dedy);
        System.out.println(ninjak.contains(new Heroes("dedy",67,55,55,jump)));


    }
}
