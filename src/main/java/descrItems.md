# Description du package Items
---
## Liste des classes - fonctionnalités

>- **CarteI et CarteS**

**Imbriquer ces 2 classes dnas Carte ??? Aura t-on accès aux 2 champs spéciaux value(Char/Int)?**

>    - Ces classes nous servent à créer les cartes selon 2 attributs uniquement : couleur/valeur [entière] (*CarteI*) ou valeur/charactère (*CarteS*). En effet les cartes peuvent avoir un entier de 1 à 10 ou une "puissance" (comme définie dans a classe) : *Roi, Dame, Valet, As*
>        - La séparation de ces 2 clsses, permettent de ne pas créer de conflit, en terme de signature constructeur. Les deux constructeurs sont parfaitement identiques, même si les process sont légèrement différent.
>        - Y sont déjà intégrés les *getters*, une fonciton de description de la carte (*descrCarte()*) et des focntions de *comparaison* [de couleur/valeur].
>            - Pas besoin de setters, car nous n'aurons pas à modifier de valeur/couleur de carte pendant la partie.

>- **Packet**
>    - Elle regroupe l'ensemble de toutes les cartes (*le packet*), formé par la fonction *initPacket()*. On pourra également créer des sous-packets (*decks*), qui seront distribués [aléatoirement] aux joueurs, pour commener la partie.

