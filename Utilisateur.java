import java.util.ArrayList;

public class Utilisateur {
    private String nom;
    private int numeroIdentification;
    private ArrayList<Livre> livresEmpruntes;
    private boolean eligibleEmprunt;

    public Utilisateur(String nom, int numeroIdentification, boolean eligibleEmprunt) {
        this.nom = nom;
        this.numeroIdentification = numeroIdentification;
        this.livresEmpruntes = new ArrayList<>();
        this.eligibleEmprunt = eligibleEmprunt;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumeroIdentification() {
        return numeroIdentification;
    }

    public void setNumeroIdentification(int numeroIdentification) {
        this.numeroIdentification = numeroIdentification;
    }

    public ArrayList<Livre> getLivresEmpruntes() {
        return livresEmpruntes;
    }

    public void setLivresEmpruntes(ArrayList<Livre> livresEmpruntes) {
        this.livresEmpruntes = livresEmpruntes;
    }

    public boolean isEligibleEmprunt() {
        return eligibleEmprunt;
    }

    public void setEligibleEmprunt(boolean eligibleEmprunt) {
        this.eligibleEmprunt = eligibleEmprunt;
    }

    public void emprunterLivre(Livre livre) {
        if (eligibleEmprunt) {
            livresEmpruntes.add(livre);
            System.out.println("Livre emprunté avec succès.");
        } else {
            System.out.println("Désolé, vous n'êtes pas éligible pour emprunter des livres pour le moment.");
        }
    }

    public void retournerLivre(Livre livre) {
        if (livresEmpruntes.remove(livre)) {
            System.out.println("Livre retourné avec succès.");
        } else {
            System.out.println("Vous n'avez pas emprunté ce livre.");
        }
    }

    public void afficherLivresEmpruntes() {
        System.out.println("Livres empruntés par " + nom + " :");
        for (Livre livre : livresEmpruntes) {
            System.out.println(livre);
        }
    }
}
