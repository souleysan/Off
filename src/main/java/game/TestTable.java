package game;
import players.*;
import items.*;
import java.util.Scanner;
public class TestTable {


    public static void main (String [] args) {

        int nbCarte;

        Scanner nbC = new Scanner(System.in);
        System.out.println("Combien de cartes ?");
        if (nbC.hasNextInt()){
            nbCarte = nbC.nextInt();
        }


        Packet g = new Packet(); g.initPacket();
        // Player j = new Player("DARON", g, nbCarte);
        // Player k = new Player("MAMA", g, nbCarte);
        // Player l = new Player("SOSO", g, nbCarte);

        Table t = new Table();
        t.addJoueurs(j); t.addJoueurs(k); t.addJoueurs(l);
        t.afficherJoueurs();
    }
    
}
