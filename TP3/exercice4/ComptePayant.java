// Travail à faire 1 : classe ComptePayant, hérite de Compte
// Chaque opération (retrait ou versement) coûte 5 dh.
public class ComptePayant extends Compte {
    private static final double TAUX_OPERATION = 5; // 5 dh par opération

    // Travail à faire 2 : constructeurs d'initialisation
    public ComptePayant(Client proprietaire, Agence agence) {
        super(proprietaire, agence);
    }

    public ComptePayant(Client proprietaire, Agence agence, double soldeInitial) {
        super(proprietaire, agence, soldeInitial);
    }

    // Versement payant : on ajoute le montant puis on déduit 5 dh
    @Override
    public void deposer(double montant) {
        super.deposer(montant);
        solde -= TAUX_OPERATION;
    }

    // Retrait payant : on retire le montant puis on déduit 5 dh de frais
    @Override
    public void retirer(double montant) {
        super.retirer(montant);
        solde -= TAUX_OPERATION;
    }

    // Travail à faire 3 : redéfinition de toString()
    @Override
    public String toString() {
        return super.toString() + " (payant, " + TAUX_OPERATION + " dh/opération)";
    }
}
