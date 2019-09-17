import com.enigma.model.People;

import java.lang.reflect.Array;
import java.util.*;

public class MainTugas2 {
    public static void main(String[] args) {

        Set<People> angga = new HashSet<>();
            angga.add(new People("Joe"));
            angga.add(new People("irfan"));
            angga.add(new People("nama"));
            angga.add(new People("sam"));
            angga.add(new People("adist"));
            angga.add(new People("roy"));
            angga.add(new People("arif"));
            angga.add(new People("rifai"));

        Set<People>Joe = new HashSet<>();
            Joe.add(new People("bambang"));
            Joe.add(new People("jono"));
            Joe.add(new People("udin"));
            Joe.add(new People("irfan"));
            Joe.add(new People("arif"));
            Joe.add(new People("roy"));
            Joe.add(new People("agam"));
            Joe.add(new People("eida"));
            Set<People> intersection = new HashSet<>(angga);
            System.out.print("Teman angga = ");
            for (People nama: angga){
                System.out.print(nama.getNamaTeman());
            }
            System.out.println();
            System.out.print("Teman Joe = ");
            for (People nama: Joe){
                System.out.print(nama.getNamaTeman());
            }
            System.out.println();
            intersection.retainAll(Joe);
            System.out.print("Mutual Friens = ");
            for (People nama: intersection){
                System.out.print(nama.getNamaTeman()+" ");

            }
        }
    }
