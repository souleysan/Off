package items;
import game.Plateau;
import players.*;

public class TestPacket {
    //  private static enum Color {CARREAU, COEUR, PIQUE, TREFLE};
    //  private static enum Value {AS, DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI};

    public static void main(String [] args) {

        // public Player(String name, Packet packetGeneral, int nc) {this.nom = name; this.deck = packetGeneral.deckPlayer(nc);}

        System.out.println("\n Test de construction \n");
        Packet j = new Packet(); j.initPacketEntier();
        Player k = new Player("name", j, 25);
        // Plateau l = new Plateau();
        k.deck.contenu();
        k.poserCarte(1);
        Plateau.table.contenu();
        k.deck.contenu();

    }


}
