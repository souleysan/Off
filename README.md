# Le 8 Americain - Projet GitHub
**Au 19/11/25**

---
## Solo GitHub project - Remastering (Crazy Heights)
### Préface

Il s'agit d'un remastering du jeu de carte le "8 Americain". Avec un deck de 8 cartes par joueurs (mode classique), l'objectif est de se débarraser de toutes ses cartes. C'est un jeu qui se joue au tour par tour, dans lequel (pour la 1e version) on autorisera un maximum de 4 joueurs.
Le code source ainsi que les tests seront développés en Java et ce, dans un cadre à titre personnel.
Les objectifs seront :
- Implémenter une version console fonctionnelle et jouable (jusqu'à 4)
  - Permettra d'éxecuter plusiers parties complètes
- Développer une version graphique (si Dieu le veut 😅)
  - Grâce aux bibliothèques AWT/Swing/JavaFX

**Ranked Mode** (en plusieurs manches)
- Implementer un mode "compétition" du jeu
  - Les joueurs définissent ensemble un nombre de points à atteindre (le contrat) et le jeu se deroule normalement jusqu'à ce qu'il y ait un vainqueur (personne n'ayant plus de cartes)
  - Chaque carte dans la main d'un joueur vaut un certain nombre de points.
  - A la fin de la manche, chaque joueur recolte le nombre de points de ses adversaires uniquement (pas les siens)
  - Le premier à remplir le contrat, gagne la partie
---
### Architecture prévisionnelle
<br>

#### Organisation du travail
A définir...

#### Organisation du répertoire prévue - Ajout des *.java/*Test.java ultérieurement
```
A redéfinir, à cause des packages !


Crazy_Heights
  ├── blank.yml
  ├── build.gradle
  ├── gradlew
  ├── gradlew.bat
  ├── gradleFIC
  │   ├── gradle
  │   │   └── wrapper
  │   │       ├── gradle-wrapper.jar
  │   │       └── gradle-wrapper.properties
  │   └── settings.gradle
  │
  ├── AUHTORS.MD
  ├── ARCHITECTURE.md
  ├── CHANGELOG.mg
  ├── CONTRIBUTING.md
  ├── LICENSE
  └── README.md

```

---
### Pré requis matériels
- Java : au moins 17 au plus 21
- Gradle (installé sur la machine)

---
### Gradle
- gradle build (pour compiler le projet)
- gradle test (pour effectuer les tests)
  - Les tests seront effetués au fur et à mesure de l'avancée des travaux


---
### Outils
- Java 17
- Gradle (build & dépendances)
- JUnit 5 (tests)
- GitHub Actions (gestion de version, CI uniquement, pour le moment --> le CD sera vu plus tard)
- Dans la mesure du possible :
  - Swing / AWT (pour l'Interface graphique)
  - (Checkstyle ?)

---
> <br>
>
> **NB**
> Cette initiative sera pleinement entreprise par ma personne [SANÉ Souleymane] et n'est qu'à titre privé.
> Tout le procédé de construction du projet ne servira que pour mon expérience personnelle.
> Je n'utiliserai pas de méthologie SCRUM, ni de méthode Agile, pas de sprints réguliers, pas de réunions etc... étant donné que je suis seul sur ce mini-projet.
