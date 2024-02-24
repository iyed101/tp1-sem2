import java.util.Comparator;

public class CompareMoyenne implements Comparator<Etudiant> {


    @Override
    public int compare(Etudiant e1, Etudiant e2) {
        if(e2.getValue()==e1.getValue()){
            return 0;
        }
        else if(e2.getValue()>e1.getValue()){
            return 1;
        }else{
            return -1;
        } 
    }

}
