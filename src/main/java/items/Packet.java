package items; import java.util.ArrayList; import java.util.Scanner;

public class Packet {

    public ArrayList <Carte> packetComplet;

    /** Constructeur d'un packet de type ArrayList<Carte>
     *
     */
    public Packet() {this.packetComplet = new ArrayList<Carte>();}


    /** Méthode d'initialisation du packet complet de 52 cartes
     *
     */
    public ArrayList<Carte> initPacket() {
        for (int j = 0; j <= 3; j++) {
            for (int i = 0; i <= 12; i++) {
                this.packetComplet.add(new Carte(i, j));
            }
        } return packetComplet;
    }


    /** Méthode contenu (sans argument) - Affiche toutes les cartes du packet
     *
     */
    public void getPacket() {
        System.out.println("Ce packet est composé de : \n"); for (Carte c : this.packetComplet) {c.descr();}
    }

    
    /** Méthode contenu (avec argument entier) - Affiche la carte à l'indice index
     *
     * @return
     */
    public void contenu(int index) {
        this.packetComplet.get(index).descr();
    }


    /** Permet d'initialiser un deck, avec un nombre de carte cimpris entre 1 et 9
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

        while (f < nbCarte) {
            int def = (int)(Math.random()*(this.packetComplet.size() - 1 - f));
            if(this.packetComplet.contains(this.packetComplet.get(def))) {
                deck.packetComplet.add(this.packetComplet.get(def));
                this.packetComplet.remove(this.packetComplet.get(def)); f++;
            } else {}
        } return deck;
    }


}