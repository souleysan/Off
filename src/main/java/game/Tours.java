package game;
import java.util.*;
import players.*;

public class Tours {
    public static Player [] joueur = {new Player("Rouge", null, 8), new Player("Bleu", null, 0), new Player("Vert", null, 0), new Player("Jaune", null, 0)};
    public static ArrayList <Player> listRotation;
    // Scanner name = new Scanner(System.in);


    public Tours(int nombreJoueurs, int nombreCarte) {
        Tours.listRotation = new ArrayList<>();

        for (int i = 1; i < nombreJoueurs; i ++) {
            Tours.listRotation.add(Tours.joueur[i - 1]);
        }
    }
    

    /** Dès qu'un joueur pose un Valet, l'ordre des tours est inversé */
    public void changeSens() {}

    /** Dès qu'un joueur pose un 10, il peut rejouer (ou piocher) */
    public void rejouer() {}

    /** Dès qu'un joueur pose un 7, alors on saute le tour du joueur suivant */
    public void sauterTour() {}
}
