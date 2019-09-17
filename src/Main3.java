import com.enigma.model.Heroes;
import com.enigma.model.Skill;

import java.util.HashSet;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        Skill jump = new Skill("jump",22,33);

        Set<Heroes> heroes = new HashSet<>();
        heroes.add(new Heroes("ninja",70,50,10,jump));
        heroes.add(new Heroes("ninja",71,50,10,jump));
        heroes.add(new Heroes("ninja",72,50,10,jump));
        for (Heroes nilai: heroes){
            System.out.println(nilai);
        }
        System.out.println(heroes.size());
    }
}
