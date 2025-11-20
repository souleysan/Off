/* MODÈLE JAVADOC
        /**
         * Classe CartI implémentant les Worms du jeu.
         * 
         * @author SANE Souleymane
         * 
         * @see ArrayList#getClass()
         * @see Math#getClass()
         * 
         * @see Config#getClass()
         * @see DisplayView#getClass()
         * @see Main#getClass()
         * 
         * @since 0.0
         * 
         * @version 1.1
     */

package items;
public class Carte {
    /**
     * Classe Carte implémente les cartes du jeu
     * 
     * @author SANE Souleymane 
     */

    //  ENUMERATION APPARTENANT A LA CLASSE CARTE
    private static enum Value {AS, DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI};
        private static enum Color {CARREAU, COEUR, PIQUE, TREFLE};


    //  ATTRIBUTS DE LA CLASSE
    private final Value value;
    private final Color color;

    //  CONSTRUCTEURS
    /** Constructeur de cartes classqiue et spéciale, selon 2 enumeration
     * 
     * @param val
     * @param indexColor
     */
    public Carte(int val, int indexColor) {this.value = Value.values()[val]; this.color = Color.values()[indexColor];}

    // GETTERS - Pas besoin de setters étant donné que les attributs sont final
    /** Sert à recuperer la valeur de la carte
     * 
     * @return
     */
    public Value getValue() {return this.value;}

    /** Sert à recuperer la couleur de la carte
     * 
     * @return
     */
    public Color getColor() {return this.color;}

    //  METHODES

    /** Affiche une très courte description de la carte
     * 
     */
    public void descr() {
        System.out.println(this.value + " de " + this.color + "\n");
    }

    /** Nous indique, si la carte d'appel et la carte paramètre ont la même valeur
     * 
     * @param c
     * @return
     */
    public boolean sameValue(Carte c) {return this.value == c.value;}

    /** Nous indique, si la carte d'appel et la carte paramètre ont la même couleur   
     * 
     * @param c
     * @return
     */
    public boolean sameColor(Carte c) {return this.color == c.color;}

    /** Fonction equals - Verifie l'égalité entre 2 cartes
     * 
     * @param c
     * @return
     */
    public boolean equals(Carte c) {
        return this.sameValue(c) && this.sameColor(c);
    }

    /** Verifie la conformité de la valeur de la carte, qu'elle soit comprise dans l'enumeration de valeur (value), de type Value
     * 
     * @return
     */
    public boolean checkValue() {
        for (Value v : Value.values()){
            if (this.value == v) {
                return true;
            }
        }
        return false;
    }

    /** Vérifie la conformité de la couleur de la carte, qu'elle soit comprise dans l'enumeration de couleur (color) de type Color
     *  Pas très utile dans notre cas, puisque la couleur est incluse dans l'enumération
     * @return
     */
    public boolean checkColor() {
        for (Color c : Color.values()){
            if (this.color == c) {
                return true;
            }
        }
        return false;
    }

    /** Fonction nothing qui ne fais rien. Juste pour enlever la remarque de la classe Packet qui dit que je n'utilise même pas Carte c, compteur de la longueur de packetComplet avant le wile de initDeckPlayer
     * 
     */
    public void nothing() {}
}