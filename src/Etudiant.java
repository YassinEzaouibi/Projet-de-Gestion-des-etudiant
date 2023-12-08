import java.util.ArrayList;

class Etudiant {
    private String nom;
    ArrayList<Matiere> matieres;
    Matiere matiere;

    public Etudiant(String nom, ArrayList<Matiere> matieres) {
        this.nom = nom;
        this.matieres = matieres;
    }
    public String getNom() {
        return nom;
    }

    public void afficherDetails() {
        System.out.println("Nom de l'étudiant : " + this.nom);
        System.out.println("les matier est les notes : ");
            for (Matiere matiere : matieres) {
                System.out.println(matiere.getNotes());
        }
    }
}
