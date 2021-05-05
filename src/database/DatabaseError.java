package database;


/**
 * Exception levée en cas d'erreur sur la base de données
 */
public class DatabaseError extends DaoError {

    public DatabaseError() {
        super();
    }

    public DatabaseError(String message) {
        super(message);
    }
    
}