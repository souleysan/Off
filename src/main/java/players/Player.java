package players; import items.*;
import java.util.Scanner;

public class Player {
    public static Packet plateau = new Packet();
    public static Packet pioche = new Packet();

    private final String nom;
    private Packet deck = new Packet();
    // int score; //   Pour le mode compétition - règles expliquées prochainement dans le README.md

    /** Constructeur de joueur, qui possède un nom (bien sûr)et un deck (de type Packet)
     * 
     * @param n
     * @param packetGeneral
     */
    public Player(String name, Packet packetGeneral) {this.nom = name; this.deck = packetGeneral.initDeckPlayer();}

    /** Getter du nom du joueur
     * 
     * @return
     */
    public String getName() {return this.nom;}
    
    /** Getter du deck du joueur, qui affiche la description de don packet
     * 
     */
    public void getDeck() {this.deck.getPacket();}
    
    /** Méthode pour poser une carte (jouer une carte)
     * 
     * @param id
     */
    public void poseCarte(int index) {

        if (index >= 0 && index <= this.deck.packetComplet.size() - 1) { //  "Si index index est correct (compris entre 0 et 10), pour pouvoir recuperer une carte et éviter le outOfBounds "
            Player.plateau.packetComplet.add(this.deck.packetComplet.get(index)); //   On ajoute (pose) une carte au (sur le) plateau (pateau de type Packet, il est static pour que tous les joueurs ait le même plateau --> tous les joueurs jouent ensemble sur le même plateau, LOGIK !)
            this.deck.packetComplet.remove(this.deck.packetComplet.get(index));
        } else {System.out.println("Impossible de poser ce type de carte...\n");}
    }

    /** Méthode pour initialiser et mettre à jour la pioche durant la partie
     * 
     * @return
     */
    public static Packet initMAJPioche() {
        Player.pioche.packetComplet.clear(); // On efface simpement le contenu de la pioche, au lieu de créer une nouvelle instance de la classe Packet (moins d'espace occupé, liberation dd'espace, par la supression d'éléments)
    
        while (Player.plateau.packetComplet.size() - 2 >= 0) { // On fait le size() - 2 car on ne veur pas récupérer la dernière carte posée (qui correspond à packetC.siza()-1), comme on veut pas le size - 1, on prend le precedant, size() - 2
            Player.pioche.packetComplet.add(plateau.packetComplet.get(Player.plateau.packetComplet.size() - 2)); // On ajoute la carte à la nouvelle pioche
            Player.plateau.packetComplet.remove(Player.plateau.packetComplet.size() - 2); //    On enleve du plateau les carte ajouté à la pioche
        }   return Player.pioche;
    }

    /** Methode pour piocher une carte dans la pioche principale
     * 
     */
    public void piocher() {
        this.deck.packetComplet.add(Player.pioche.packetComplet.get((int)(Math.random())*(Player.pioche.packetComplet.size() - 1)));
        Player.pioche.packetComplet.remove((int)(Math.random())*(Player.pioche.packetComplet.size() - 1));
    }


    /*---------------- Dans la classe Partie ---------------- */


    /** Dès qu'un joueur pose un 8, il choisit la couleur du prochain joueur, et ce dernier devra s'y soumettre
     *
     */
    public void choisirCouleur() {

        System.out.println("\nQuelle couleur souhaitez-vous imposer ? (Tapez le numéro correspondant)\n\n1 : CARREAU       2 : COEUR     3 : PIQUE     4 : TREFLE ?\n");

        Scanner col = new Scanner(System.in);
        int couleur = col.nextInt() -1;

        System.out.println("\nVous avez choisi " + Carte.Color.values()[couleur]);

    }

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
    public void initScore() {}

}