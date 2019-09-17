import com.enigma.model.AssasinHeroes;
import com.enigma.model.Heroes;
import com.enigma.model.Skill;
import com.enigma.model.Tower;

public class Main2 {
    public static void main(String[] args) {
        //===================================PRAKTIK ABSTRAK============ exerciese 4
        Skill jump = new Skill("jump",22,33);
        Heroes gundala = new Heroes("Gundala",100,100,15,jump);
        Heroes saitama = new Heroes("Saitama",1000,500,50,jump);
        Tower tower = new Tower(3000,50);
        AssasinHeroes ninja = new AssasinHeroes("ninja",70,50,10,jump);
        saitama.attack(tower);
        saitama.castSkill(gundala);
        saitama.castSkill(ninja);
        //gundala.attack(saitama);Tower.attack(saitama);
        System.out.println(gundala.print());
        System.out.println(saitama.print());
        System.out.println(tower.print());


    }
}
