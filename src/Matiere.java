import java.util.ArrayList;

public class Matiere {
    private static int nMatier;
    private ArrayList<Float> notes;

    public Matiere(int nMatier, ArrayList<Float> notes) {
        this.nMatier = nMatier;
        this.notes = notes;
    }

    public int getnMatier() {
        return nMatier;
    }

    public void setnMatier(int nMatier) {
        this.nMatier = nMatier;
    }

    public ArrayList<Float> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Float> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Matiere{" +
                "nMatier=" + nMatier +
                ", notes=" + notes +
                '}';
    }
}
