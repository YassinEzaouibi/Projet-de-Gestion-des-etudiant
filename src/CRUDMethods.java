import java.util.ArrayList;

interface CRUDMethods {
    void create(String nom, ArrayList<Matiere> matieres);

    void read();

    void update(String nom, double nouvelleNote1, double nouvelleNote2);

    void delete(String nom);

    }










