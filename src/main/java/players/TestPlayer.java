package players;
import game.Plateau;
import items.*;
public class TestPlayer {
    
    public static void main(String [] args) {

        Packet general = new Packet(); general.initPacketEntier();

        Plateau p = new Plateau();

        Player sousou = new Player("2S", general,4);
        sousou.getName();
        sousou.getDeck(); sousou.poserCarte(4); Plateau.table.contenu();
        sousou.poserCarte(3); Plateau.table.contenu();
        sousou.getDeck(); sousou.poserCarte(2); Plateau.table.contenu();
        sousou.getDeck(); sousou.poserCarte(4); Plateau.table.contenu();

        Plateau.table.contenu();
        



    }
}
