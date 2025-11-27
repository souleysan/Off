package players;
import game.*;
import items.*;
import java.util.*;

public class Player {
    private String nom;
    public Packet deck = new Packet();
    /* private int score; // Pour le mode compétition - règles expliquées prochainement dans le README.md */


    public Player(String name, Packet packetGeneral, int nombreCarte) {this.nom = name; this.deck = packetGeneral.deckPlayer(nombreCarte);}
    public Player() {}


    public String getName() {return this.nom;}


    public Packet getDeck() {return this.deck;}


    // public int getScore() {return this.score;}


    public void setName(String n) {this.nom = n;}


    public void setDeck(Packet p, int nc) {this.deck = p.deckPlayer(nc);}


    public void descrDeck() {System.out.print("\n" + this.nom + " : "); this.deck.contenu();}


    public void poserCarte() {
        Scanner i = new Scanner(System.in); int index;

        while (true) {
            System.out.println("Quelle carte choisissez-vous, tapez le chiffre, puis 'Entrez'\n");
            index = i.nextInt(); System.out.println("\n");
            if ((index >= 1) && (index <= this.deck.packetComplet.size())) {
                Plateau.table.packetComplet.add(this.deck.packetComplet.get(index - 1));
                this.deck.packetComplet.remove(this.deck.packetComplet.get(index - 1)); break;
            } else {
                System.out.println("Choix impossible, choisissez une autre carte...\n");
            }
        } // Remonter le terminal après que le joueur précédant  ai deposé sa carte
    }


    public void piocher() {
        System.out.println("Oh bah... vous souhaitez piocher... Tenez !");
        int def = (int)((Math.random())*(Plateau.pioche.packetComplet.size() - 1));
        this.deck.packetComplet.add(Plateau.pioche.packetComplet.get(def));
        Plateau.pioche.packetComplet.remove(def);
    }


    public int choixCouleur() {
    // Dès qu'un joueur pose un 8, il choisit la couleur du prochain joueur, et ce dernier devra s'y soumettre

        Scanner col = new Scanner(System.in); int couleur;

        while (true) {
        System.out.println("\nQuelle couleur souhaitez-vous imposer ?\n\n1 : CARREAU        2 : COEUR       3 : PIQUE       4 : TREFLE \n");
            if (col.hasNextInt()) {
                couleur = col.nextInt() -1;

                if ((couleur >= 0) && (couleur <=3)) {break;}
                else {System.out.println("\nChoix imposible... Entrez une des valeurs proposées");}
            } else {
                System.out.println("\nChoix imposible... Entrez une des valeurs proposées");
                col.next();
            }
        }

        System.out.println("\nLe joueur précédent vient de vous imposer le " + Carte.Color.values()[couleur] + "\n");
        return couleur;

    }


    /** Methode pour le mode ranked, avec les scores */
    // public void initScore() {}


}