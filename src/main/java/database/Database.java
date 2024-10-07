package database;

public class Database {
    private String serveur;
    private String nomDeLaBase;
    private String utilisateur;
    private String motDePasse;

    public Database(String serveur, String nomDeLaBase, String utilisateur, String motDePasse) {
        this.serveur = serveur;
        this.nomDeLaBase = nomDeLaBase;
        this.utilisateur = utilisateur;
        this.motDePasse = motDePasse;
    }

    private String getUrl() {
        return "jdbc:mysql://" + serveur + "/" + nomDeLaBase + "?serverTimezone=UTC";
    }

    public Connection getConnexion() throws SQLException {
        return DriverManager.getConnection(getUrl(), utilisateur, motDePasse);
    }
}