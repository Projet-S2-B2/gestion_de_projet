package database;



/**
 * Exception levée en cas de mauvais utilisateur
 */
public class BadUserError extends DaoError {

    public BadUserError() {
        super("Mauvais utilisateur!");
    }

}