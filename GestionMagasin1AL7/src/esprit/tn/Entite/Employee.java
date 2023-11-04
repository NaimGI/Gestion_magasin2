package esprit.tn.Entite;

public class Employee {
    private int id;
    private String nom;
    private String adresse;
    private int nbr_heures;

    public Employee(int id, String nom, String adresse, int nbr_heures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNbr_heures() {
        return nbr_heures;
    }

    public double calculerSalaire() {
        return 0; // La méthode sera implémentée dans les classes filles
    }

}
