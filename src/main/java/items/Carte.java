/* MODÈLE JAVADOC
        /**
         * Classe ... implémentant ...
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

    
    public static enum Value {AS, DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI};
    public static enum Color {CARREAU, COEUR, PIQUE, TREFLE};

    private final Value value;
    private final Color color;


    /** Constructeur de carte, selon 2 énumerateurs
     *
     * @param val
     * @param indexColor
     */
    public Carte(int val, int indexColor) {this.value = Value.values()[val]; this.color = Color.values()[indexColor];}


    /** Sert à récupérer la valeur de la carte
     *
     * @return
     */
    public Value getValue() {return this.value;}


    /** Sert à récupérer la couleur de la carte
     *
     * @return
     */
    public Color getColor() {return this.color;}


    /** Affiche une description de la carte
     *
     */
    public void descr() {System.out.println(this.value + " de " + this.color);}


    /** Nous indique si la carte d'appel et la carte paramètre ont la même valeur
     *
     * @param c
     * @return
     */
    public boolean sameValue(Carte c) {return this.value == c.value;}


    /** Nous indique si la carte d'appel et la carte paramètre ont la même couleur
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


}