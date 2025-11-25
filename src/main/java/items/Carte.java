package items;

public class Carte {
    public static enum Value {AS, DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI};
    public static enum Color {CARREAU, COEUR, PIQUE, TREFLE};
    private final Value value;
    private final Color color;


    public Carte(int val, int indexColor) {this.value = Value.values()[val]; this.color = Color.values()[indexColor];}


    public Value getValue() {return this.value;}


    public Color getColor() {return this.color;}


    public void descr() {
        switch (color) {
            case CARREAU : System.out.println(this.value + " de ♦️"); break;
            case COEUR : System.out.println(this.value + " de ♥️"); break;
            case PIQUE : System.out.println(this.value + " de ♠️"); break;
            default: System.out.println(this.value + " de ♣️");
        }
        
        // System.out.println(this.value + " de " + this.color);
    }


    public boolean sameValue(Carte c) {return this.value == c.value;}


    public boolean sameColor(Carte c) {return this.color == c.color;}


    public boolean equals(Carte c) {return this.sameValue(c) && this.sameColor(c);}


}