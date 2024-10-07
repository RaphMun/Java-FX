package database;

public boolean inscription(Utilisateur utilisateur) throws SQLException {
        Connection connexion = database.getConnexion();
        PreparedStatement requetePrepare = connexion.prepareStatement("INSERT INTO Utilisateur (nom, prenom, email, motDePasse, actif, age) VALUES (?, ?, ?, ?, ?, ?)");
        requetePrepare.setString(1, utilisateur.getNom());
        requetePrepare.setString(2, utilisateur.getPrenom());
        requetePrepare.setString(3, utilisateur.getEmail());
        requetePrepare.setString(4, utilisateur.getMotDePasse());
        requetePrepare.setBoolean(5, utilisateur.isActif());
        requetePrepare.setInt(6, utilisateur.getAge());
        int resultat = requetePrepare.executeUpdate();
        return resultat > 0;
        }
