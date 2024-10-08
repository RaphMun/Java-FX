package appli.todolistjx.database;

public Utilisateur getUtilisateurByEmail(String email) throws SQLException {
        Connection connexion = database.getConnexion();
        PreparedStatement requetePrepare = connexion.prepareStatement("SELECT * FROM Utilisateur WHERE email = ?");
        requetePrepare.setString(1, email);
        ResultSet resultat = requetePrepare.executeQuery();
        if (resultat.next()) {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(resultat.getInt("id"));
        utilisateur.setNom(resultat.getString("nom"));
        utilisateur.setPrenom(resultat.getString("prenom"));
        utilisateur.setEmail(resultat.getString("email"));
        utilisateur.setMotDePasse(resultat.getString("motDePasse"));
        utilisateur.setActif(resultat.getBoolean("actif"));
        utilisateur.setAge(resultat.getInt("age"));
        return utilisateur;
        } else {
        return null;
        }
        }