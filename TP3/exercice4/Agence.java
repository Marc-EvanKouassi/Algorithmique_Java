import java.util.ArrayList;

// Travail à faire 1 : classe Agence
public class Agence {
    // Travail à faire 2 : compteur statique pour l'incrémentation automatique du numéro
    private static int compteur = 0;

    private String numero;
    private String adresse;
    private ArrayList<Client> lesClients = new ArrayList<>();
    private ArrayList<Compte> lesComptes = new ArrayList<>();

    // Travail à faire 2 : constructeur d'initialisation
    // Identifiant = NomClasse:NuméroObjet (Agence:1, Agence:2...)
    // grâce à getClass().getName()
    public Agence(String adresse) {
        compteur++;
        this.numero = this.getClass().getName() + ":" + compteur;
        this.adresse = adresse;
    }

    public String getNumero() { return numero; }
    public String getAdresse() { return adresse; }

    public Compte getCompte(int i) { return lesComptes.get(i); }
    public Client getClient(int i) { return lesClients.get(i); }

    public void addCompte(Compte c) { lesComptes.add(c); }
    public void addClient(Client c) { lesClients.add(c); }

    public int getNbClients() { return lesClients.size(); }
    public int getNbComptes() { return lesComptes.size(); }

    // Travail à faire 3 : redéfinition de toString()
    @Override
    public String toString() {
        return numero + " [adresse=" + adresse + ", clients=" + getNbClients()
                + ", comptes=" + getNbComptes() + "]";
    }
}
