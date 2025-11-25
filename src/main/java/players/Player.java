package players;
import game.*;
import items.*;
import java.util.*;

public class Player {
    private final String nom;
    public Packet deck = new Packet();
    /* int score; Pour le mode compétition - règles expliquées prochainement dans le README.md */


    public Player(String name, Packet packetGeneral, int nombreCarte) {this.nom = name; this.deck = packetGeneral.deckPlayer(nombreCarte);}


    public void getName() {System.out.println(this.nom);}


    public void getDeck() { System.out.print(this.nom + " : "); this.deck.contenu();}


    public void poserCarte(int index) {
        Scanner i = new Scanner(System.in);

        while (true) {
            if ((index >= 1) && (index <= this.deck.packetComplet.size())) {
                Plateau.table.packetComplet.add(this.deck.packetComplet.get(index - 1));
                this.deck.packetComplet.remove(this.deck.packetComplet.get(index - 1)); break;
            } else {
                System.out.println("Choix impossible, choisissez une autre carte...\n");
                index = i.nextInt();
            }
        }
    }


    public void piocher() {
        int def = (int)((Math.random())*(Plateau.pioche.packetComplet.size() - 1));
        this.deck.packetComplet.add(Plateau.pioche.packetComplet.get(def));
        Plateau.pioche.packetComplet.remove(def);
    }


    public int choixCouleur() {// Dès qu'un joueur pose un 8, il choisit la couleur du prochain joueur, et ce dernier devra s'y soumettre

        Scanner col = new Scanner(System.in); int couleur;

        while (true) {
        System.out.println("\nQuelle couleur souhaitez-vous imposer ? (Tapez le numéro correspondant)\n\n1 : CARREAU        2 : COEUR       3 : PIQUE       4 : TREFLE ?\n");
            if (col.hasNextInt()) {
                couleur = col.nextInt() -1;

                if ((couleur >= 0) && (couleur <=3)) {break;}
                else {System.out.println("\nChoix imposible... Entrez une des valeurs proposées");}
            } else {
                System.out.println("\nChoix imposible... Entrez une des valeurs proposées");
                col.next();
            }
        }

        System.out.println("\nVous avez choisi " + Carte.Color.values()[couleur]);
        return couleur;

    }

    /*---------------- Dans la classe Partie ---------------- */

    /** Dès qu'un joueur pose un Valet, l'ordre des tours est inversé
     *
     */
    public void changeSens() {}

    /** Dès qu'un joueur pose un 10, il peut rejouer (ou piocher)
     *
     */
    public void rejouer() {}

    /** Dès qu'un joueur pose un 7, alors on saute le tour du joueur suivant
     *
     */
    public void sauterTour() {}

    /** Methode pour le mode ranked, avec les scores
     * 
     */
    // public void initScore() {}


}