package game;
import items.Packet;

public class Plateau {
    public static Packet table;
    public static Packet pioche;


    public Plateau() {this.table = new Packet(); this.pioche = new Packet();}


    // public void addJoueurs(Player p) {Plateau.joueurs.add(p);}
    // public void afficherJoueurs() {for (Player j : Plateau.joueurs) {j.getName();}}


    public void contenuTable() {
        System.out.print("TABLE : "); this.table.contenu();
    }


    public void contenuPioche() {
        System.out.print("PIOCHE : "); this.pioche.contenu();
    }


    public static Packet initMAJPioche() {
        Plateau.pioche.packetComplet.clear();
    
        while (Plateau.table.packetComplet.size() - 2 >= 0) { // On fait le size() - 2 car on ne veur pas récupérer la dernière carte posée (qui correspond à packetC.siza()-1), comme on veut pas le size - 1, on prend le precedant, size() - 2
            Plateau.pioche.packetComplet.add(table.packetComplet.get(Plateau.table.packetComplet.size() - 2)); // On ajoute la carte à la nouvelle pioche
            Plateau.table.packetComplet.remove(Plateau.table.packetComplet.size() - 2); //    On enleve du table les carte ajouté à la pioche
        }   return Plateau.pioche;
    }




}
