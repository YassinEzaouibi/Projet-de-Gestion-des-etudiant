# Système de Gestion des Étudiants

Il s'agit d'un système simple de gestion des étudiants qui vous permet de gérer les étudiants et leurs notes dans différentes matières. Le programme est développé en Java et suit les principes de la programmation orientée objet.

## Fonctionnalités

- **Ajouter un Étudiant :**
  - Saisissez le nom de l'étudiant et le nombre de matières.
  - Pour chaque matière, entrez le nombre de notes et leurs valeurs.

- **Afficher la Liste des Étudiants :**
  - Visualisez une liste d'étudiants avec leurs détails, y compris les notes dans chaque matière.

- **Quitter le Programme :**
  - Fermez le programme à tout moment.

## Structure du Projet

- **Classe Principale (`Main`):**
  - Contient la méthode principale pour exécuter le programme.
  - Affiche un menu pour l'interaction de l'utilisateur.

- **Classe Étudiant (`Etudiant`):**
  - Représente un étudiant avec un nom et une liste de matières avec des notes.
  - Inclut une méthode pour afficher les détails de l'étudiant.

- **Classe Matière (`Matiere`):**
  - Représente une matière avec un identifiant (`nMatier`) et un tableau de notes.
  - Utilisée pour stocker les notes associées à une matière.

- **Classe Gestion des Étudiants (`GestionDesEtudiants`):**
  - Gère la création, la lecture, la mise à jour et la suppression d'étudiants.
  - Utilise une `ArrayList` pour stocker les objets `Étudiant`.
  - Chaque étudiant a une liste de matières avec des notes associées.

