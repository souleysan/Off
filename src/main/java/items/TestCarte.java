package items;
public class TestCarte {

    //  enum Color {CARREAU, COEUR, PIQUE, TREFLE};
    //  enum Value {AS, DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI};

    public static void main (String [] args) {

        System.out.println("\n Test de construction \n");
        Carte cp = new Carte(4,2); cp.descr();
        Carte sp = new Carte(8,2); cp.descr();
        Carte ht = new Carte(9,3); ht.descr();
        Carte rc = new Carte(12,1); rc.descr();
        Carte dc = new Carte(11,0); dc.descr();
        System.out.println("\n");


        System.out.println("Test de comparaison \n");
        System.out.println(cp.sameValue(sp)); System.out.println(cp.sameColor(sp));

        
        System.out.println("Test conformité \n");
        System.out.print(cp.checkColor() + " - "); System.out.println(cp.checkValue());
        System.out.print(ht.checkColor() + " - "); System.out.println(ht.checkValue());
        System.out.print(rc.checkColor() + " - "); System.out.println(rc.checkValue());
        System.out.print(dc.checkColor() + " - "); System.out.println(dc.checkValue());

    }
    
}
