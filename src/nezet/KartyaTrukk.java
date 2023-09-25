package nezet;

import modell.Pakli;
import java.util.Scanner;

public class KartyaTrukk {

    private final Scanner sc = new Scanner(System.in);
    Pakli p1 = new Pakli();

    public KartyaTrukk() {
        indit();
    }
    
    private int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        System.out.println("");
        return oszlop;
    }

    public void indit() {
        
        p1.feltolt();
        for (int i = 0; i < 3; i++) {

            kirak();
            int oszlop = melyik();
            p1.kever(oszlop);
        }
        System.out.println("A választott lap: " + p1.ezVolt());
    }

    public void kirak() {
        for (int i = 1; i < p1.getPakli().length; i++) {
            System.out.printf("%-8s", p1.getPakli()[i]);

            if (i % 3 == 0) {
                System.out.println("");

            }
        }
    }
    
    
}
