public class Fiche {
    private String numero;
    private String adresse;
    private String nom;
    public Fiche(String nom,String num , String adrs){
        this.nom=nom;
        this.numero=num;
        this.adresse=adrs;
    }
    public String getNum(){
        return this.numero;
    }
    public String getAdrs(){
        return this.adresse;
    }
    public String getNom(){
        return this.nom;
    }
    public String toString(){
        return "Nom: "+this.nom+", Numéro: "+this.numero+", Adressse"+this.adresse;
    }
}