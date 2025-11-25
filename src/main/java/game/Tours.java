package game;
import java.util.*;
import players.Player;
import items.*;

public class Tours {
    public static ArrayList <Player> listRotation;
    Scanner name = new Scanner(System.in);


    public Tours(int nombreJoueurs, int nombreCarte) {Tours.listRotation = new ArrayList<>();
        switch (nombreJoueurs) {
            case 2 :
                for (int i = 0; i < nombreJoueurs; i++) {
                    Player jj = new Player(null, null, nombreCarte); Tours.listRotation.add(j);
                    Player kk = new Player(null, null, nombreCarte); Tours.listRotation.add(k);
                }
            case 3 :
                Player jjj = new Player(null, null, nombreCarte);
                Player kkk = new Player(null, null, nombreCarte);
                Player lll = new Player(null, null, nombreCarte);

            case 4 :
                Player jjjj = new Player(null, null, nombreCarte);
                Player kkkk = new Player(null, null, nombreCarte);
                Player llll = new Player(null, null, nombreCarte);
                Player mmmm = new Player(null, null, nombreCarte);

        }
    }
    
}
