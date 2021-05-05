package database;

import metier.User;
import metier.Tech;


/**
 * Gère l'accès des utilisateurs aux données
 */
public class UserDao {

	/**
	 * Lit un utilisateur depuis la BD. En cas d'erreur, lève une exception.
	 * @param aLogin login de l'utilisateur cherché
	 * @param aPassHash valeur de hachage du mot de passe de l'utilisateur cherché
	 * @return L'utilisateur chargé depuis la BD.
	 */
	public User Read(String aLogin, String aPassHash) throws DaoError {
		
	}

	/**
	 * Met à jour l'utilisateur dans la BD
	 * @param aUser L'utilisateur à mettre à jour
	 */
	public void Update(User aUser) {
		
	}

	/**
	 * Liste les techniciens
	 * @return un ensemble d'utilisateurs qui sont des techniciens
	 */
	public Tech[] ListTechs() {
		
	}
}