
public class Note implements Comparable<Note>{
    private String intitule;
    private float note ;

    public Note(String intit,float not){
        this.intitule=intit;
        this.note=not;
    }
    public String getIntitule() {
        return intitule;
    }

    public float getNote() {
        return note;
    }
    @Override
    public int compareTo(Note n) {
        if(this.note==n.getNote()){
            return 0;
        }
        else if(this.note>n.getNote()){
            return 1;
        }else{
            return-1;
        }
    }
}
