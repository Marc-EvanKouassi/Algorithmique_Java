// Travail à faire 1 : classe CompteEpargne, hérite de Compte
public class CompteEpargne extends Compte {
    // Champ "TauxIntérêt = 6" (partagé par tous les comptes épargne : static)
    private static double taux = 6;

    // Travail à faire 2 : constructeurs d'initialisation
    public CompteEpargne(Client proprietaire, Agence agence) {
        super(proprietaire, agence);
    }

    public CompteEpargne(Client proprietaire, Agence agence, double soldeInitial) {
        super(proprietaire, agence, soldeInitial);
    }

    public static double getTaux() { return taux; }
    public static void setTaux(double t) { taux = t; }

    // calculInteret() : met à jour le solde en tenant compte des intérêts
    public void calculInteret() {
        solde += solde * taux / 100;
    }

    // Travail à faire 3 : redéfinition de toString()
    @Override
    public String toString() {
        return super.toString() + " (épargne, taux=" + taux + "%)";
    }
}
