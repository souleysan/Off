# Description du package players
---
## Liste des classes - fonctionnalités

- **Players**
- Ajout des méthodes getName() et getDeck(), afin d'obtenir le nom ainsi que le packet du joueur, qui renvoie une description de toutes les cartes de sa main.
- Le joueur a la possibilité de poser une carte...
    - Avec poseCarte() qui ajoute la carte souhaitée au plateau (de type ArrayList également) et la remove du packet du joueur.
- ...Ou piocher (piocher()), qui retire une carte aléatoire de la pioche et l'ajoute au jeu du joueur concerné.
- La pioche est initialisée et mise à jour avec la même fontion : initMAJPioche(), ne prennant tout le plateau SAUF, la dernière carte posée.


- Selon les règle du jeu, il est possible de faire plusieurs actions spéciales
    - Sauter le tour du joueur suivant en posant un 7
    - Poser un 8 n'importe quand
    - Choisir la couleur du prochain joueur en posant un 8

<br>

>- **Tours**
