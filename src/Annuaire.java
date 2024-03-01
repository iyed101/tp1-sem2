import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Annuaire {
    private Map<String,Fiche> fiches;
    public Annuaire(){
        this.fiches= new LinkedHashMap<>();
    }
    public Map<String,Fiche> getMap(){
        return fiches;
    }
    public void ajouterFiche(Fiche f){
        fiches.put(f.getNom(),f);
    }
    public void afficheTout(){

        for (String i:fiches.keySet()){
            System.out.println(fiches.get(i));
        }
    }
    public Fiche chercheFiche(String nm){
        return fiches.get(nm);
    }
    public static void main(String[] args) {
        Annuaire An=new Annuaire();
        Scanner scanner= new Scanner(System.in);
        while (true) {
            System.out.println("Entrez une commande (+nom, ?nom, ! ou .) : ");
            String commande = scanner.nextLine();
            if(commande.equals(".")){
                break;
            }
            else if(commande.startsWith("+")){
                System.out.println("Entrez le numéro de téléphone : ");
                String numero = scanner.nextLine();
                System.out.println("Entrez l'adresse : ");
                String adresse = scanner.nextLine();
                String nom = commande.substring(1);
                Fiche f =new Fiche(nom, numero, adresse);
                An.ajouterFiche(f);
                f=null;
            }
            else if(commande.startsWith("!")){

                An.afficheTout();
            }
            else if(commande.startsWith("?")){
                String nom = commande.substring(1);
                Fiche fiche=An.chercheFiche(nom);
                if(fiche!=null){
                    System.out.println(fiche);
                }
                else{
                    System.out.println("Il n'est pas une fiche de nom "+nom);
                }
            }
            else{
                System.out.println("il n y a pas une commande de se nom la !");
            }
        }
        scanner.close();
    }
}
