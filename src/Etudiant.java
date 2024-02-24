import java.util.ArrayList;
public class Etudiant implements Statisticable,Comparable<Etudiant> {
    private String matricule;
    private String nom;
    private ArrayList<Note> notes;
    public Etudiant(String mat,String nm){
        this.matricule=mat;
        this.nom=nm;
        this.notes=new ArrayList<>();
    }
    public String getMatricule() {
        return matricule;
    }
    public String getNom(){
        return nom;
    }
    public void addNote(String intit,float not){
        Note note=new Note(intit,not);
        notes.add(note);
    }
    public ArrayList<Note> getNotes(){
        return notes;
    }
    @Override
    public float getValue() {
        float somme=0;
        for (Note note:notes){
            somme+=note.getNote();
        }
        return somme/notes.size();
    }
    @Override
    public int compareTo(Etudiant e) {
        return this.getMatricule().compareTo(e.getMatricule());
    }

}


