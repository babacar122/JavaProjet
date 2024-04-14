public class Menu {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

     public void afficher(){ 
        clearScreen();
        System.out.println("************************************************************************************************");
        System.out.println("*                                                                                              *");
        System.out.println("*                                   __________________________                                 *");
        System.out.println("*                                 _/            |             \\_                               *");
        System.out.println("*                                / |  ________  |   ________  | \\                              *");
        System.out.println("*                                | |  ________  |   ________  | |                              *");
        System.out.println("*                                | |  ________  |   ________  | |                              *");
        System.out.println("*                                | |  ________  |   ________  | |                              *");
        System.out.println("*                                | |  ________  |   ________  | |                              *");
        System.out.println("*                                | |  ________  |   ________  | |                              *");
        System.out.println("*                                | |  ________  |   ________  | |                              *");
        System.out.println("*                                | |            |             | |                              *");
        System.out.println("*                                | \\____________V_____________/ |                              *");
        System.out.println("*                                \\______________________________/                              *");
        System.out.println("*                                                                                              *");         
        System.out.println("*                                   MA BIBLIOTHEQUE, BIENVENU !                                *");
        System.out.println("*                                                                                              *");
        System.out.println("*                                                                                              *");
        System.out.println("*                        VOICI LE MENU:                                                        *");
        System.out.println("*                                                                                              *");
        System.out.println("*                                 1. GESTION DES LIVRES                                        *");
        System.out.println("*                                 2. GESTION DES EMPRUNTS                                      *");
        System.out.println("*                                 3. GESTION DES UTILISATEURS                                  *");
        System.out.println("*                                 4. QUITTER                                                   *");
        System.out.println("*                                                                                              *");
        System.out.println("*                        FAITES VOTRE CHOIX                                                    *");
        System.out.println("*                                                                                              *");
        System.out.println("*                                                                                              *");
        System.out.println("************************************************************************************************");
    }    
    public void livre(){
        System.out.println("************************************************************************************************");
        System.out.println("*                                                                                              *");
        System.out.println("*                                                                                              *");
        System.out.println("*                                      GESTION DES LIVRES                                      *");
        System.out.println("*                                                                                              *");
        System.out.println("*                                                                                              *");
        System.out.println("*                         1. AJOUTER UN  LIVRE                                                 *");
        System.out.println("*                         2. RECHERCHER UN LIVRE                                               *");
        System.out.println("*                         3. SUPPRIMER UN LIVRE                                                *");
        System.out.println("*                         4. STATISTIQUE DE LA BIBLIOTHEQUE                                               *");
        System.out.println("*                         5. QUITTER                                                           *");
        System.out.println("*                                                                                              *");
        System.out.println("*                                                                                              *");
        System.out.println("************************************************************************************************");
        System.out.println("Que voulez vous faire ?");
         
    }   
    public void utilisateur(){
        System.out.println("************************************************************************************************");
        System.out.println("*                                                                                              *");
        System.out.println("*                                                                                              *");
        System.out.println("*                                  GESTION DES UTILISATEURS                                    *");
        System.out.println("*                                                                                              *");
        System.out.println("*                                                                                              *");
        System.out.println("*                        1. Enregistrer un nouveau utilisateur                                 *");
        System.out.println("*                        2. Verifier l'eligibilite des utilisateurs a emprunt                  *");
        System.out.println("*                        3. QUITTER                                                            *");
        System.out.println("*                                                                                              *");
        System.out.println("*                                                                                              *");
        System.out.println("************************************************************************************************");
        System.out.println("Que voulez vous faire ?");

    }   
    public void emprunt(){
        System.out.println("************************************************************************************************");
        System.out.println("*                                                                                              *");
        System.out.println("*                                                                                              *");
        System.out.println("*                                  GESTION DES EMPRUNTS                                        *");
        System.out.println("*                                                                                              *");
        System.out.println("*                                                                                              *");
        System.out.println("*                        1. Enregistrer les EMPRUNTS et les retours de livres                  *");
        System.out.println("*                        2. Faire un retour                                                    *");
        System.out.println("*                        3. QUITTER                                                            *");
        System.out.println("*                                                                                              *");
        System.out.println("*                                                                                              *");
        System.out.println("************************************************************************************************");
        System.out.println("Que voulez vous faire ?");

    }  
}