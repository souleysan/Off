package items;
import java.util.Scanner;

public class TestPacket {
    //  private static enum Color {CARREAU, COEUR, PIQUE, TREFLE};
    //  private static enum Value {AS, DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI};

    public static void main(String [] args) {

        // System.out.println("\n Test de construction \n");

        Packet p = new Packet();
        // System.out.println("\n Initialisation des j :\n ");
        p.initPacket();

        // System.out.println("\n Creation et contenu du deck : "); 
        // p.initDeckPlayer().getPacket(); 
        
        // System.out.println("\n Contenu de pC : ");
        // p.initDeck().getPacket();

        // System.out.println("\n Contenu de pC : ");        
        // p.getPacket();

        Packet j1 = p.initDeckPlayer(); System.out.println(); j1.getPacket();
        // Packet j2 = p.initDeckPlayer(); System.out.println("Deck du joueur j2 \n"); j2.getPacket(); System.out.println();
        // Packet j3 = p.initDeckPlayer(); System.out.println("Deck du joueur j3 \n"); j3.getPacket(); System.out.println();
        // Packet j4 = p.initDeckPlayer(); System.out.println("Deck du joueur j4 \n"); j4.getPacket(); System.out.println();
        
        // Scanner nbJoueurs = new Scanner(System.in); 
        // System.out.println("entre valeur :\n");
        // int v = nbJoueurs.nextInt();
        // if (v==1){System.out.println("joueur = 1");} else {System.out.println("non");}

        /* Test de de la focntion choisirCouleur() */

    }
    
}
