package implement;
public class TestPacket {

    // private static char[] power = new char[]{'R', 'D', 'V', 'A'};
    // private static String[] color = new String[]{"carreau", "coeur", "pique", "trefle"};
    
    public static void main (String [] args) {
    
        System.out.println("\n " + "Test de construction" + "\n" + "\n");
        
        CarteI cP = new CarteI(5, 2);
        System.out.print(cP.getValue() + " "); System.out.print(cP.getColor() + " ");
        System.out.println(cP.descrCarte());
        
        CarteI hC = new CarteI(8, 0);
        System.out.print(hC.getValue() + " "); System.out.print(hC.getColor() + " ");
        System.out.println(hC.descrCarte());
        
        CarteS rC = new CarteS(0, 1);
        System.out.print(rC.getValue() + " "); System.out.print(rC.getColor() + " ");
        System.out.println(rC.descrCarte());
        
        CarteS vT = new CarteS(2, 3);
        System.out.print(vT.getValue() + " "); System.out.print(vT.getColor() + " ");
        System.out.println(vT.descrCarte());
        
        /* System.out.println("\n " + "Test de comparaison" + "\n" + "\n");
        
        System.out.println(cP.sameColor(cP));
        System.out.println(rC.sameColor(vT));
        System.out.println(cP.sameValue(hC));
        System.out.println(rC.sameValue(rC));
    
        System.out.println("\n " + "Test de conformité" + "\n" + "\n");
        
        System.out.println(cP.checkValue());
        System.out.println(rC.checkValue());
        System.out.println(hC.checkColor());
        System.out.println(vT.checkColor()); */

        System.out.println("\n " + "Test de typage" + "\n" + "\n");

        System.out.println(cP.getClass());
        System.out.println(hC.getClass());
        System.out.println(rC.getClass());
        System.out.println(vT.getClass());
        
    }
}
