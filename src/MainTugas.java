import com.enigma.model.Circle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainTugas {
    public static void main(String[] args) {
        Set<Circle> circleSet = new HashSet<>();
        circleSet.add(new Circle(10));
        circleSet.add(new Circle(5));
        circleSet.add(new Circle(1));
        circleSet.add(new Circle(1));
        circleSet.add(new Circle(1));
        circleSet.add(new Circle(3));
        circleSet.add(new Circle(4));

        System.out.println("=============");
        for (Circle nilai: circleSet){
            System.out.println(nilai.getR());
        }
        System.out.println("============");
        System.out.println(circleSet.size());

    }
}

