import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionDesEtudiants gestionDesEtudiants = new GestionDesEtudiants();


        while (true) {
            System.out.println("\nMenu Gestion des Étudiants :");
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Afficher la liste des étudiants avec les notes");
            System.out.println("3. Mettre à jour les notes d'un étudiant");
            System.out.println("4. Supprimer un étudiant");
            System.out.println("5. Quitter");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    ajouterEtudiant(gestionDesEtudiants, scanner);
                    break;
                case 2:
                    gestionDesEtudiants.read();
                    break;
                case 3:
                    mettreAJourNotes(gestionDesEtudiants, scanner);
                    break;
                case 4:
                    supprimerEtudiant(gestionDesEtudiants, scanner);
                    break;
                case 5:
                    System.out.println("M3a Salama !");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Choix invalide. Veuillez choisir à nouveau.");
            }
        }
    }

    private static void ajouterEtudiant(GestionDesEtudiants gestionDesEtudiants, Scanner scanner) {
        Matiere matieres;
        ArrayList<Float> notes = new ArrayList<>();
        ArrayList<Matiere> matieres1 = new ArrayList<>();
        System.out.println("Entrez le nom de l'étudiant : ");
        String nom = scanner.next();
        System.out.println("Entrez le nombre des matiere : ");
        int nMatier = scanner.nextInt();
        for (int i = 1; i <= nMatier; i++){
            System.out.println("Entrez le nombre des notes pour la matier "+i+": ");
            int nNotes = scanner.nextInt();
            for (int j = 1; j <= nNotes; j++){
                System.out.println("donner la note "+j+":");
                notes.add(scanner.nextFloat());            }
            matieres1.add(new Matiere(nMatier, notes));
        }

        gestionDesEtudiants.create(nom, matieres1);
    }

    private static void mettreAJourNotes(GestionDesEtudiants gestionDesEtudiants, Scanner scanner) {
        System.out.println("Entrez le nom de l'étudiant à mettre à jour : ");
        String nom = scanner.next();
        System.out.println("Entrez la nouvelle note 1 pour " + nom + " : ");
        double nouvelleNote1 = scanner.nextDouble();
        System.out.println("Entrez la nouvelle note 2 pour " + nom + " : ");
        double nouvelleNote2 = scanner.nextDouble();

        gestionDesEtudiants.update(nom, nouvelleNote1, nouvelleNote2);
    }

    private static void supprimerEtudiant(GestionDesEtudiants gestionDesEtudiants, Scanner scanner) {
        System.out.println("Entrez le nom de l'étudiant à supprimer : ");
        String nom = scanner.next();

        gestionDesEtudiants.delete(nom);
    }
}
