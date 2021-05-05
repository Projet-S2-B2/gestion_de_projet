package database;


/**
 * exception générale de la couche DAO
 */
public class DaoError extends Exception{

    public DaoError() {
        super();
    }

    public DaoError(String message) {
        super(message);
    }
    
    
}