import java.util.ArrayList;

// Travail à faire 1 : classe Client
public class Client {
    // Travail à faire 2 : compteur statique pour l'incrémentation automatique du code
    private static int compteur = 0;

    private String code;
    private String nom;
    private String prenom;
    private String adresse;
    private Agence monAgence;
    private ArrayList<Compte> mesComptes = new ArrayList<>();

    // Travail à faire 2 : constructeur d'initialisation
    // L'agence doit être précisée à la création du client.
    // Code = Client:1, Client:2... grâce à getClass().getName()
    public Client(String nom, String prenom, String adresse, Agence agence) {
        compteur++;
        this.code = this.getClass().getName() + ":" + compteur;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.monAgence = agence;
        agence.addClient(this); // le client est enregistré dans son agence
    }

    public String getCode() { return code; }
    public Agence getMonAgence() { return monAgence; }

    public Compte getCompte(int i) { return mesComptes.get(i); }
    public void addCompte(Compte c) { mesComptes.add(c); }
    public int getNbComptes() { return mesComptes.size(); }

    // Question 4c : déposer une somme dans le compte d'indice i du client
    public void deposer(int i, double montant) {
        getCompte(i).deposer(montant);
    }

    // Question 4d : retirer une somme du compte d'indice i du client
    public void retirer(int i, double montant) {
        getCompte(i).retirer(montant);
    }

    // Travail à faire 3 : redéfinition de toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(code).append(" [").append(prenom).append(" ").append(nom)
          .append(", ").append(adresse).append(", ").append(monAgence.getNumero())
          .append(", comptes=").append(mesComptes.size()).append("]");
        for (Compte c : mesComptes) {
            sb.append("\n    ").append(c);
        }
        return sb.toString();
    }
}
