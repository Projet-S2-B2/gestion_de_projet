package gestion.de.projet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import metier.Project;

public class ProjectDao {

    public ProjectDao(){
        
    }

    public Project[] ListAll() throws SQLException{
        ArrayList<Project> projects = new ArrayList<>();
        
        String url = "jdbc:mysql://panel.romainalcon.me:3306/c1_msp";
        String user = "c1_msp";
        String pass = "JS3vo@kh4LN";
        Connection connexion = DriverManager.getConnection(url, user, pass);
        
        Statement statement = connexion.createStatement();
        ResultSet resultat = statement.executeQuery("SELECT * FROM projet");
        
        while (resultat.next()) {
            int id = resultat.getInt("id");
            String name = resultat.getString("nom");
            String statut = resultat.getString("statut");
            int estimedTime = resultat.getInt("dureeEstimee");
            Project pj = new Project();
            pj.setID(id);
            pj.setName(name);
            pj.setStatut(ProjectStatus.valueOf(statut));
            pj.setEstimatedDurationMinutes(estimedTime);
            projects.add(pj);
        }
        
        connexion.close();
        return (Project[])projects.toArray();
    }
    
    public void Update(Project p){

    }
}
