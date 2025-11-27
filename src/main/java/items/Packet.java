package items;
import java.util.*;

public class Packet {
    public ArrayList <Carte> packetComplet;


    public Packet() {this.packetComplet = new ArrayList<>();}


    public void contenu() {
        System.out.print("Voici l'état du packet : \n\n|  "); int f = 1;
        for (Carte c : this.packetComplet) {
            System.out.print(f + " : "); c.descr(); f++;
        } // System.out.println("\n--------------------------------------------------");
        System.out.println("\n__________________________________________________");
        System.out.println("\n");
    }


    public void contenu(int index) {this.packetComplet.get(index).descr();} // surcharge


    public ArrayList <Carte> initPacketEntier() {
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 13; i++) {
                this.packetComplet.add(new Carte(i, j));
            }
        } return this.packetComplet;
    }


    public Packet deckPlayer(int nc) {
        Packet deck = new Packet();

        /*
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
        */

        while (true) {
            if ((nc >= 1) && (nc <= 9)) {
                int f = 0;
                while (f < nc) {
                    int def = (int)((Math.random())*(this.packetComplet.size() - 1 - f));
                    if(this.packetComplet.contains(this.packetComplet.get(def))) { f++;
                        deck.packetComplet.add(this.packetComplet.get(def));
                        this.packetComplet.remove(this.packetComplet.get(def));
                    } else {}
                } break;
            } else {
                if (nc < 1) {nc = 1;}
                else if (nc > 9) {nc = 9;}
            }
        } return deck;
    }


}