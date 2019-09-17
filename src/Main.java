import com.enigma.model.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
//        AssasinHeroes balmond = new AssasinHeroes("ball",40,44,44,jump);
//        Heroes gundala = new Heroes("gundala",44,44,44,jump);
//        Object apaaja = balmond;
//        gundala.attack((Heroes) apaaja);
//        gundala.attack(balmond);
//        System.out.println(balmond.equals(apaaja));

//========================PRAKTIK PERANG=============
            System.out.print("Input amo  :");
            String jumlah = dataIn.readLine();
            int amo = Integer.parseInt(jumlah);
            System.out.print("Range Target  :");
            String meter = dataIn.readLine();
            int range = Integer.parseInt(meter);
            Sniper AWM = new Sniper(amo, range);
            System.out.println("Pilih senjata ");
            System.out.println("1. AWM ");
            System.out.println("2. VSS ");
            System.out.print("input Senjata ");
            String pilihan = dataIn.readLine();
            AWM.senjata(pilihan);
            AWM.shot();
            System.out.println(AWM.print());



    }

}
