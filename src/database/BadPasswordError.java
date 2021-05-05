package database;



/**
 * Exception levée en cas de mauvais mot de passe
 */
public class BadPasswordError extends DaoError {

    public BadPasswordError() {
        super();
    }

    public BadPasswordError(String message) {
        super(message);
    }
    
    
    
}