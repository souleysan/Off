package items; import java.util.ArrayList; import java.util.Scanner;

public class Packet {

    //  ATTRIBUT staic, car on possède qu'un seul packet par jeu
    public ArrayList <Carte> packetComplet;
    
    /** Constructeur d'un packet de type ArrayList<Carte>
     * 
     */
    public Packet() {this.packetComplet = new ArrayList<Carte>();}

    /** Méthode d'initialisation d'un packet complet de 52 cartes
     * 
     */
    public ArrayList<Carte> initPacket() { 
        for (int j = 0; j <= 3; j++) { //   Pour chaque couleur
            for (int i = 0; i <= 12; i++) { //  Pour chaque valuer
                this.packetComplet.add(new Carte(i, j));
        }} return packetComplet;
    }

    /** Méthode contenu (sans argument) - Affiche toutes les cartes du packet
     * 
     */
    public void getPacket() {
        System.out.println("Ce packet est composé de : \n");
        for (Carte c : this.packetComplet) {c.descr();}
    }
    
    /** Méthode contenu (avec argument entier) - Affiche la carte à l'indice index
     * 
     * @return
     */
    public void contenu(int index) {
        this.packetComplet.get(index).descr();
    }

    /** A COMPLETER --> retour "récursif" à la fonciton sur une erreur d'entrée
     *  
     * Permet d'initialiser un deck [d'un/plusieurs joueur]
     * Peut être ajouter un scanner qui lit l'entré de l'utilisateur, pour qu'il uisse choisir le nombre de carte par joueurs
     * 
     * @return
     */
    public Packet initDeckPlayer() {
        Packet deck = new Packet(); int f = 0;
        Scanner num = new Scanner(System.in); int nbCarte;
        
        while (true) {
            System.out.println("Combien de carte voulez-vous ? (Entrez une valeur entre 1 et 9)\n");
            if (num.hasNextInt()) {
                nbCarte = num.nextInt();

                if ((nbCarte >= 1) && (nbCarte <= 9)) {break;}
                else {System.out.println("\nInitialisation imposible... Entrez une valeur entre 1 et 9");}
            } else {
                System.out.println("\n\nInitialisation imposible... Entrez une valeur entre 1 et 9");
                num.next();
            }
        }

        while (f < nbCarte) { //  Boucle while pour pouvoir obtenir 8 cartes : Non mbre auto-definissable plus tard ??? Variable f pour la condition    
            int def = (int)(Math.random()*(this.packetComplet.size() - 1 - f)); //  La variable définisseur de carte de manière aléatoire. Multiplication par le packetComplet.size()-1-f, car on ne veut pas ajoouter une carte IndexOutOfBounds (pas possible), donc il faut recuperer les cartes en fonction de la taille de packetComplet (qui varie constament). f nous indique en réalité combien de cartes ont été distribuée, donc ici jusqu'à 8 par appel de fonctio
            if(this.packetComplet.contains(this.packetComplet.get(def))) { //   Vérification de la présence de la carte dans this.packetComple
                deck.packetComplet.add(this.packetComplet.get(def)); // Ajout de la carte au nouveau deck du joueu
                this.packetComplet.remove(this.packetComplet.get(def)); f++; // On peut avoir 2 cartes identiques dans son deck, ce qui n'est pas souhaitable, donc on remove
            } else {} //    Si la carte n'est pas présente, on ne fait rien = on cherche une nouvele carte à ajouter = on refait les instructions de la condition car le compteur f ne s'incrémentera pas
        } return deck;
    }
    
}