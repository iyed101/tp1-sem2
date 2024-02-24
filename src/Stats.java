import java.util.ArrayList;
import java.util.Collections;
public class Stats {

    public float moyenne(Etudiant e){
        return e.getValue();
    }
    public float meuilleurNote(Etudiant e){
        return Collections.max(e.getNotes()).getNote();
    }
    public float moinsNote(Etudiant e){
        return Collections.min(e.getNotes()).getNote();
    }
    public float meilleur(ArrayList<Etudiant> etude){
        float max=etude.get(0).getValue();
        for(Etudiant et:etude){
            if(et.getValue()>max){
                max=et.getValue();
            }
        }
        return max;
    }
    public float moins(ArrayList<Etudiant> etude){
        float min=etude.get(0).getValue();
        for(Etudiant et:etude){
            if(et.getValue()<min){
                min=et.getValue();
            }
        }
        return min;
    }
    public float moyenneGn (ArrayList<Etudiant> etude){
        float MoyenneG=0;
        for (Etudiant et:etude){
            MoyenneG+=et.getValue();
        }
        return MoyenneG/etude.size();
    }
    public static void main(String[] args){
    Etudiant et1=new Etudiant("3", "iyed bnch");
    Etudiant et2=new Etudiant("2", "iyedd");
    Etudiant et3=new Etudiant("1", "iyeeeed");
    Stats stat=new Stats();
    ArrayList<Etudiant> groupe = new ArrayList<>();
    groupe.add(et1);
    groupe.add(et2);
    groupe.add(et3);
    et1.addNote("Java", 17);
    et1.addNote("Anglis", 16);
    // System.out.println(et1.getValue());
    et2.addNote("Java", 12);
    et2.addNote("Anglis", 10);
    // System.out.println(et2.getValue());
    et3.addNote("Java", 15);
    et3.addNote("Anglis", 14);
    System.out.println("moyenne etudiant 1° "+stat.moyenne(et1));
    System.out.println("moyenne etudiant 2° "+stat.moyenne(et2));
    System.out.println("moyenne etudiant 3° "+stat.moyenne(et3));
    System.out.println("best "+stat.meilleur(groupe));
    System.out.println("worst "+stat.moins(groupe));
    System.out.println("moyenne generale "+stat.moyenneGn(groupe));
    System.out.println(stat.meuilleurNote(et3));
    System.out.println(stat.moinsNote(et3));
    Collections.sort(groupe);
    System.out.println("\nTri par matricule:");
    for (Etudiant etud:groupe){
        System.err.println(etud.getNom());
    }
    Collections.sort(groupe, new CompareMoyenne());
    System.out.println("\nTri par moyenne:");
    for (Etudiant etud:groupe){
        System.err.println(etud.getNom());
    }
    Collections.sort(groupe, new CompareNom());
    System.out.println("\nTri par nom:");
    for (Etudiant etud:groupe){
        System.err.println(etud.getNom());
    }
}
}
