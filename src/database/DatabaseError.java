package database;


/**
 * Exception levée en cas d'erreur sur la base de données
 */
public class DatabaseError extends DaoError {

    public DatabaseError() {
        super("Erreur au niveau de la base de donnée");
    }

    
}