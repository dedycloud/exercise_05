import com.enigma.model.Heroes;
import com.enigma.model.Skill;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        //=====================ITERATOR==========================
        Skill jump = new Skill("jump",22,33);
        List<Heroes> ninjak = new ArrayList<>();
        ninjak.add(new Heroes("dedy",55,55,55,jump));
        ninjak.add(new Heroes("dedy",88,55,55,jump));
        System.out.println(ninjak.size());
        System.out.println("=======");
        Heroes dedy = new Heroes("dedy",55,55,55,jump);
        Iterator<Heroes> iterator = ninjak.iterator();
        while (iterator.hasNext()){
            Heroes heroes = iterator.next();
            System.out.println(heroes.getHp());
            if (heroes.equals(dedy)){
                iterator.remove();
            }
            System.out.println("=======");
            System.out.println(ninjak.size());
            System.out.println("=======");
            iterator = ninjak.iterator();
            while (iterator.hasNext()){
                Heroes heroes1 = iterator.next();
                System.out.println(heroes1.getHp());
            }
            System.out.println(ninjak.size());

        }
    }
}
