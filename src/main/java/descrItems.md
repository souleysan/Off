# Description du package items
---
## Liste des classes - fonctionnalités

>- **Carte**
>    - Cette class nous sert à créer les cartes selon 2 attributs couleur/valeur, à partir d'ENUMERATEURS, en prenant les couleurs classiques du jeu et des valeurs de AS à ROI.
>    - Y sont déjà intégrés les *getters*, une fonction de description de la carte (*descr()*) et des focntions de *comparaison* [de couleur/valeur] et d'egalité d'objet.
>            - Pas besoin de setters, car nous n'aurons pas à modifier de valeur/couleur de carte pendant la partie.
<br>

>- **Packet**
>   - Cette class regroupe l'ensemble de toutes les cartes (*le packet*), formé par la fonction *initPacket()*. On pourra également créer des sous-packets (*decks*) pour chaqe joueurs avec la fonction initDeckPlayer(), qui seront distribués [aléatoirement], en demandant en amont le nombre de carte souhaitées.
>   - Les objets de type Packet sont des ArrayList, car automatiquement redimensionnable et facile d'utilisation avec une assez grande flexibilité.
>   - Les methodes de getters et de description egélament ajoutées
<br>

>- **Players**
<br>

>- **Tours**
