// Travail à faire 1 : classe Compte (classe mère de CompteEpargne et ComptePayant)
public class Compte {
    // Travail à faire 2 : compteur statique pour l'incrémentation automatique du code
    private static int compteur = 0;

    private String code;
    protected double solde;          // peut être positif (créditeur) ou négatif (débiteur)
    protected Agence lAgence;        // agence où le compte a été ouvert
    protected Client proprietaire;   // propriétaire du compte

    // Travail à faire 2 : constructeur avec solde nul
    public Compte(Client proprietaire, Agence agence) {
        this(proprietaire, agence, 0);
    }

    // Travail à faire 2 : constructeur avec solde initialisé par une somme
    // Code = NomClasse:Numéro (ex. CompteEpargne:1) grâce à getClass().getName()
    public Compte(Client proprietaire, Agence agence, double soldeInitial) {
        // Règle : un client ne peut avoir des comptes que dans une seule agence
        if (proprietaire.getMonAgence() != agence) {
            throw new IllegalArgumentException(
                "Un client ne peut avoir des comptes que dans une seule agence.");
        }
        compteur++;
        this.code = this.getClass().getName() + ":" + compteur;
        this.solde = soldeInitial;
        this.proprietaire = proprietaire; // le compte est associé à son propriétaire
        this.lAgence = agence;            // et à l'agence d'ouverture
        proprietaire.addCompte(this);
        agence.addCompte(this);
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    // Consultation du solde
    public double getSolde() { return solde; }

    // Question 4c : dépôt
    public void deposer(double montant) {
        solde += montant;
    }

    // Question 4d : retrait (le solde peut devenir négatif : compte débiteur)
    public void retirer(double montant) {
        solde -= montant;
    }

    // Travail à faire 3 : redéfinition de toString()
    @Override
    public String toString() {
        return code + " [solde=" + solde + " dh, propriétaire=" + proprietaire.getCode()
                + ", agence=" + lAgence.getNumero() + "]";
    }
}
