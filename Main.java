import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Bibliotheque bibliotheque = new Bibliotheque();
    private static ArrayList<Utilisateur> utilisateurs = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu();
        int choix;

        do {
            menu.afficher();
            choix = scanner.nextInt();
            scanner.nextLine(); 

            switch (choix) {
                case 1:
                    gestionLivres();  
                    break;
                case 2:
                    gestionEmprunts(); 
                    break;
                case 3:
                    gestionUtilisateurs(); 
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 4);
    }

    private static void gestionLivres() {
        Menu menu = new Menu();
        int choix;

        do {
            menu.livre();
            choix = scanner.nextInt();
            scanner.nextLine(); // Pour un retoure a la ligne

            switch (choix) {
                case 1:
                    ajouterLivre();
                    break;
                case 2:
                    rechercherLivre();
                    break;
                case 3:
                    supprimerLivre();
                    break;
                case 4:
                    bibliotheque.afficherStatistiques();
                    break;
                case 5:
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez reessayer.");
            }
        } while (choix != 5);
    }

    private static void ajouterLivre() {
        System.out.println("Titre du livre :");
        String titre = scanner.nextLine();
        System.out.println("Auteur du livre :");
        String auteur = scanner.nextLine();
        System.out.println("Année de publication :");
        int anneePublication = scanner.nextInt();
        scanner.nextLine(); // Consommer le retour à la ligne
        System.out.println("ISBN :");
        String isbn = scanner.nextLine();

        Livre livre = new Livre(titre, auteur, anneePublication, isbn);
        bibliotheque.ajouterLivre(livre);
    }

    private static void rechercherLivre() {
        System.out.println("Entrez le critère de recherche (titre, auteur ou ISBN) :");
        String critere = scanner.nextLine();
        bibliotheque.rechercherLivre(critere);
    }

    private static void supprimerLivre() {
        System.out.println("Entrez le titre du livre à supprimer :");
        String titre = scanner.nextLine();
        System.out.println("Entrez l'auteur du livre à supprimer :");
        String auteur = scanner.nextLine();
        System.out.println("Entrez l'année de publication :");
        int anneePublication = scanner.nextInt();
        scanner.nextLine(); // Consommer le retour à la ligne
        System.out.println("Entrez l'ISBN :");
        String isbn = scanner.nextLine();

        Livre livre = new Livre(titre, auteur, anneePublication, isbn);
        bibliotheque.supprimerLivre(livre);
    }

    private static void gestionEmprunts() {
        Menu menu = new Menu();
        int choix;

        do {
            menu.emprunt();
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne

            switch (choix) {
                case 1:
                    enregistrerEmprunt();
                    break;
                case 2:
                    enregistrerRetour();
                    break;
                case 3:
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 3);
    }

    private static void enregistrerEmprunt() {
        System.out.println("Entrez le nom de l'utilisateur :");
        String nom = scanner.nextLine();
        Utilisateur utilisateur = rechercherUtilisateur(nom);
        if (utilisateur != null) {
            System.out.println("Entrez le titre du livre :");
            String titre = scanner.nextLine();
            System.out.println("Entrez l'auteur du livre :");
            String auteur = scanner.nextLine();
            System.out.println("Entrez l'année de publication :");
            int anneePublication = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne
            System.out.println("Entrez l'ISBN :");
            String isbn = scanner.nextLine();

            Livre livre = new Livre(titre, auteur, anneePublication, isbn);
            bibliotheque.enregistrerEmprunt(utilisateur, livre);
        } else {
            System.out.println("Utilisateur non trouvé.");
        }
    }

    private static void enregistrerRetour() {
        System.out.println("Entrez le nom de l'utilisateur :");
        String nom = scanner.nextLine();
        Utilisateur utilisateur = rechercherUtilisateur(nom);
        if (utilisateur != null) {
            System.out.println("Entrez le titre du livre :");
            String titre = scanner.nextLine();
            System.out.println("Entrez l'auteur du livre :");
            String auteur = scanner.nextLine();
            System.out.println("Entrez l'année de publication :");
            int anneePublication = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne
            System.out.println("Entrez l'ISBN :");
            String isbn = scanner.nextLine();

            Livre livre = new Livre(titre, auteur, anneePublication, isbn);
            bibliotheque.enregistrerRetour(utilisateur, livre);
        } else {
            System.out.println("Utilisateur non trouvé.");
        }
    }

    private static void gestionUtilisateurs() {
        Menu menu = new Menu();
        int choix;

        do {
            menu.utilisateur();
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne

            switch (choix) {
                case 1:
                    enregistrerUtilisateur();
                    break;
                case 2:
                    verifierEligibiliteUtilisateurs();
                    break;
                case 3:
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 3);
    }

    private static void enregistrerUtilisateur() {
        System.out.println("Entrez le nom de l'utilisateur :");
        String nom = scanner.nextLine();
        System.out.println("Entrez le numéro d'identification :");
        int numeroIdentification = scanner.nextInt();
        scanner.nextLine(); // Consommer le retour à la ligne
        System.out.println("L'utilisateur est-il éligible pour emprunter des livres ? (true/false)");
        boolean eligibleEmprunt = scanner.nextBoolean();
        scanner.nextLine(); // Consommer le retour à la ligne

        Utilisateur utilisateur = new Utilisateur(nom, numeroIdentification, eligibleEmprunt);
        utilisateurs.add(utilisateur);
        System.out.println("Utilisateur ajouté avec succès.");
    }
    private static void verifierEligibiliteUtilisateurs() {
        for (Utilisateur utilisateur : utilisateurs) {
            System.out.println(utilisateur.getNom() + " est éligible pour emprunter des livres : " + utilisateur.isEligibleEmprunt());
        }
    }
    
    private static Utilisateur rechercherUtilisateur(String nom) {
        for (Utilisateur utilisateur : utilisateurs) {
            if (utilisateur.getNom().equals(nom)) {
                return utilisateur;
            }
        }
        return null;
    }
}