package items;

// import java.util.ArrayList;

public class TestPacket {
    //  private static enum Color {CARREAU, COEUR, PIQUE, TREFLE};
    //  private static enum Value {AS, DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI};

    public static void main(String [] args) {

        // System.out.println("\n Test de construction \n");

        Packet p = new Packet();
        // System.out.println("\n Initialisation des j :\n ");
        p.initPacket();

        // System.out.println("\n Creation et contenu du deck : "); 
        // p.initDeckPlayer().contenu(); 
        
        // System.out.println("\n Contenu de pC : ");
        // p.initDeck().contenu();

        // System.out.println("\n Contenu de pC : ");        
        // p.contenu();

        // Packet j1 = p.initDeckPlayer(); System.out.println("Deck du joueur j1 \n"); j1.contenu(); System.out.println();
        // Packet j2 = p.initDeckPlayer(); System.out.println("Deck du joueur j2 \n"); j2.contenu(); System.out.println();
        // Packet j3 = p.initDeckPlayer(); System.out.println("Deck du joueur j3 \n"); j3.contenu(); System.out.println();
        Packet j4 = p.initDeckPlayer(); System.out.println("Deck du joueur j4 \n"); j4.getPacket(); System.out.println();

    }
    
}
