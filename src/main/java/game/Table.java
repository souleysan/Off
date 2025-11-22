package game; import players.*;
import java.util.ArrayList; import java.util.Scanner;

public class Table {
    
    static ArrayList<Player> tournant;
    static int nombreJoueurs;


    public Table() {
        Table.tournant = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Combien de joueurs souhaitez-vous ? (jusqu'à 4 maximum)");
            if (s.hasNextInt()) {
                Table.nombreJoueurs = s.nextInt();

                if ((Table.nombreJoueurs >= 2) && (Table.nombreJoueurs <= 4)) {
                    Player [] jouR = new Player [Table.nombreJoueurs]; s.next(); break;
                } else {System.out.println("Nombre de joueurs incorrect... Veuillez entrer un entier entre 2 et 4 inclus");}
            } else {System.out.println("Entrez un entier valide, entre 2 et 4 inclus, s'il vous plaît");}
        } System.out.println("La Table est créee... Patientez, nous ramenons les boissons");

    }

    public void addJoueurs(Player p) {Table.tournant.add(p);}


    public void afficherJoueurs() {for (Player j : Table.tournant) {j.getName();}}












}
