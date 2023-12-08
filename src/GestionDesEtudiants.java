import java.util.ArrayList;

class GestionDesEtudiants implements CRUDMethods {
    private ArrayList<Etudiant> etudiants;
    private ArrayList<Matiere> mateir;
    public GestionDesEtudiants() {
        this.etudiants = new ArrayList<>();

    }

    @Override
    public void create(String nom, ArrayList<Matiere> matieres) {
        this.etudiants.add(new Etudiant(nom, matieres));
        System.out.println("Étudiant ajouté avec succès.");

    }

    @Override
    public void read() {
        System.out.println("Liste des étudiants :");
        for (Etudiant etudiant : etudiants) {
            if (etudiant != null) {
                etudiant.afficherDetails();
            }
        }
    }

    public void update(String nom, double nouvelleNote1, double nouvelleNote2) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getNom().equalsIgnoreCase(nom)) {
                etudiant = new Etudiant(nom, mateir);
                System.out.println("Notes de l'étudiant mises à jour avec succès.");
                return;
            }
        }
        System.out.println("Étudiant non trouvé.");
    }

    @Override
    public void delete(String nom) {
        etudiants.removeIf(etudiant -> etudiant.getNom().equalsIgnoreCase(nom));
        System.out.println("Étudiant supprimé avec succès.");
    }

}