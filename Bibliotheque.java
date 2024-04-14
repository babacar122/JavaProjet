import java.util.ArrayList;
import java.util.HashMap;

public class Bibliotheque {
    private ArrayList<Livre> listeLivres;
    private HashMap<Utilisateur, ArrayList<Livre>> empruntsUtilisateurs;

    public Bibliotheque() {
        listeLivres = new ArrayList<>();
        empruntsUtilisateurs = new HashMap<>();
    }

    public ArrayList<Livre> getListeLivres() {
        return listeLivres;
    }

    public void setListeLivres(ArrayList<Livre> listeLivres) {
        this.listeLivres = listeLivres;
    }

    public HashMap<Utilisateur, ArrayList<Livre>> getEmpruntsUtilisateurs() {
        return empruntsUtilisateurs;
    }

    public void setEmpruntsUtilisateurs(HashMap<Utilisateur, ArrayList<Livre>> empruntsUtilisateurs) {
        this.empruntsUtilisateurs = empruntsUtilisateurs;
    }

    public void ajouterLivre(Livre livre) {
        listeLivres.add(livre);
        System.out.println("Livre ajouté avec succès.");
    }

    public void supprimerLivre(Livre livre) {
        if (listeLivres.remove(livre)) {
            System.out.println("Livre supprimé avec succès.");
        } else {
            System.out.println("Le livre n'existe pas dans la bibliothèque.");
        }
    }

    public void rechercherLivre(String critere) {
        boolean trouve = false;
        for (Livre livre : listeLivres) {
            if (livre.getTitre().contains(critere) || livre.getAuteur().contains(critere) || livre.getIsbn().contains(critere)) {
                System.out.println(livre);
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Aucun livre ne correspond au critère de recherche.");
        }
    }

    public void enregistrerEmprunt(Utilisateur utilisateur, Livre livre) {
        if (utilisateur.isEligibleEmprunt()) {
            utilisateur.emprunterLivre(livre);
            ArrayList<Livre> livresEmpruntes = empruntsUtilisateurs.getOrDefault(utilisateur, new ArrayList<>());
            livresEmpruntes.add(livre);
            empruntsUtilisateurs.put(utilisateur, livresEmpruntes);
        } else {
            System.out.println("L'utilisateur n'est pas éligible pour emprunter des livres.");
        }
    }

    public void enregistrerRetour(Utilisateur utilisateur, Livre livre) {
        ArrayList<Livre> livresEmpruntes = empruntsUtilisateurs.get(utilisateur);
        if (livresEmpruntes != null && livresEmpruntes.remove(livre)) {
            utilisateur.retournerLivre(livre);
        } else {
            System.out.println("L'utilisateur n'a pas emprunté ce livre.");
        }
    }

    public void afficherStatistiques() {
        System.out.println("Statistiques de la bibliothèque :");
        System.out.println("Nombre total de livres : " + listeLivres.size());
        int livresEmpruntes = 0;
        for (ArrayList<Livre> livres : empruntsUtilisateurs.values()) {
            livresEmpruntes += livres.size();
        }
        System.out.println("Nombre de livres empruntés : " + livresEmpruntes);
    }
}