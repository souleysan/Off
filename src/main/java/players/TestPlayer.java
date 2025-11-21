package players; import items.*;
public class TestPlayer {
    
    public static void main(String [] args) {

        Packet general = new Packet(); general.initPacket();

        Player sousou = new Player("sousou", general); // sousou.getDeck();

        // Player fatou = new Player("fatou", general); fatou.getDeck();
        // Player ramou = new Player("ramou", general); ramou.getDeck();
        // Player atou = new Player("atou", general); atou.getDeck();
        
        // general.contenu();
        // sousou.poseCarte(0); // Player.plateau.contenu();
        // sousou.poseCarte(2); // Player.plateau.contenu();
        // sousou.poseCarte(2); // Player.plateau.contenu();
        // sousou.poseCarte(2); // Player.plateau.contenu();
        // sousou.poseCarte(4); 
        // sousou.getDeck();
        // Player.plateau.getPacket();
        // Player.initMAJPioche().getPacket();
        // sousou.piocher(); sousou.getDeck(); Player.pioche.getPacket();
        // Player.pioche.packetComplet.clear();
        // Player.pioche.getPacket();
        // Player.mix().contenu();
        // System.out.println(Player.mix().packetComplet.size());

        sousou.choisirCouleur();

    }
}
