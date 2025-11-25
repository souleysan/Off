package game;
import items.Packet;
import java.util.*;
import players.*;

public class Plateau {

    static ArrayList<Player> joueurs;
    public static Packet table = new Packet();
    public static Packet pioche = new Packet();


    public Plateau() {}


    public void addJoueurs(Player p) {Plateau.joueurs.add(p);}


    public void afficherJoueurs() {for (Player j : Plateau.joueurs) {j.getName();}}


    /** Méthode pour initialiser et mettre à jour la pioche durant la partie
     * 
     * @return
     */
    public static Packet initMAJPioche() {//--> dans la classe table
        Plateau.pioche.packetComplet.clear(); // On efface simpement le contenu de la pioche, au lieu de créer une nouvelle instance de la classe Packet (moins d'espace occupé, liberation dd'espace, par la supression d'éléments)
    
        while (Plateau.table.packetComplet.size() - 2 >= 0) { // On fait le size() - 2 car on ne veur pas récupérer la dernière carte posée (qui correspond à packetC.siza()-1), comme on veut pas le size - 1, on prend le precedant, size() - 2
            Plateau.pioche.packetComplet.add(table.packetComplet.get(Plateau.table.packetComplet.size() - 2)); // On ajoute la carte à la nouvelle pioche
            Plateau.table.packetComplet.remove(Plateau.table.packetComplet.size() - 2); //    On enleve du table les carte ajouté à la pioche
        }   return Plateau.pioche;
    }


}
