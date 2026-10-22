// Travail à faire 4 : classe ApplicationBancaire
public class ApplicationBancaire {
    public static void main(String[] args) {

        // ----- 4a : créer une seule agence bancaire -----
        Agence agence = new Agence("12 avenue Hassan II, Casablanca");

        // ----- 4b : créer un tableau composé de 4 clients -----
        Client[] clients = new Client[4];
        clients[0] = new Client("Kouassi", "Marc", "Rue 1", agence);
        clients[1] = new Client("Traoré", "Awa", "Rue 2", agence);
        clients[2] = new Client("Diallo", "Ibrahim", "Rue 3", agence);
        clients[3] = new Client("Koné", "Fatou", "Rue 4", agence);

        // 4b : client 1 -> un compte d'épargne (solde = 1000 dh)
        new CompteEpargne(clients[0], agence, 1000);
        // 4b : client 2 -> un compte payant (solde = 2500 dh)
        new ComptePayant(clients[1], agence, 2500);
        // 4b : client 3 -> 2 comptes payants (soldes 0 dh et 3000 dh)
        new ComptePayant(clients[2], agence, 0);
        new ComptePayant(clients[2], agence, 3000);
        // 4b : client 4 -> un compte d'épargne (2300 dh) et un compte payant (0 dh)
        new CompteEpargne(clients[3], agence, 2300);
        new ComptePayant(clients[3], agence, 0);

        // Travail à faire 3 : affichage grâce aux toString() redéfinis
        System.out.println("=== Situation initiale ===");
        afficher(agence, clients);

        // ----- 4c : déposer une somme dans le/les compte(s) de chaque client (deposer) -----
        for (Client c : clients) {
            for (int i = 0; i < c.getNbComptes(); i++) {
                c.deposer(i, 500);
            }
        }
        System.out.println("\n=== Après dépôt de 500 dh sur chaque compte ===");
        afficher(agence, clients);

        // ----- 4d : retirer une somme du/des compte(s) de chaque client (retirer) -----
        for (Client c : clients) {
            for (int i = 0; i < c.getNbComptes(); i++) {
                c.retirer(i, 200);
            }
        }
        System.out.println("\n=== Après retrait de 200 dh sur chaque compte ===");
        afficher(agence, clients);

        // Test de calculInteret() sur les comptes d'épargne
        for (int i = 0; i < agence.getNbComptes(); i++) {
            Compte c = agence.getCompte(i);
            if (c instanceof CompteEpargne) {
                ((CompteEpargne) c).calculInteret();
            }
        }
        System.out.println("\n=== Après calcul des intérêts (épargne) ===");
        afficher(agence, clients);
    }

    // Affiche l'agence puis chaque client avec ses comptes
    private static void afficher(Agence agence, Client[] clients) {
        System.out.println(agence);
        for (Client c : clients) {
            System.out.println(c);
        }
    }
}
