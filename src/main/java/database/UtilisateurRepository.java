package database;

public class UtilisateurRepository {
    private Database database;

    public UtilisateurRepository(Database database) {
        this.database = database;
    }

    public boolean inscription(Utilisateur utilisateur) throws SQLException {
        Connection connexion = database.getConnexion();
        PreparedStatement requetePrepare = connexion.prepareStatement("INSERT INTO Utilisateur (nom, prenom, email, motDePasse, actif, age) VALUES (?, ?, ?, ?, ?, ?)");
        requetePrepare.setString(1, utilisateur.get