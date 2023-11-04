package esprit.tn.Entite;

public class Caissier extends Employee {
    public int numeroDeCaisse;
    public Caissier(int id, String nom, String adresse, int nbr_heures) {
        super(id, nom, adresse, nbr_heures);
    }

    @Override
    public double calculerSalaire() {
        double salaire = getNbr_heures() * 5;

        if (getNbr_heures() > 180) {
            salaire += salaire * 0.15;
        }
        return salaire;
    }
    @Override
    public String toString() {
        return "Caissier{" +
                "id=" + getId() +
                ", nom='" + getNom() + '\'' +
                ", adresse='" + getAdresse() + '\'' +
                ", nbr_heures=" + getNbr_heures() +
                '}';
    }

}