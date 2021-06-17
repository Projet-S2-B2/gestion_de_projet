package metier;

import gestion.de.projet.ProjectStatus;
import gestion.de.projet.ProjectsWindow;
import gestion.de.projet.ProjectWindow;

public class Project {
	/**private String name;
	/**
	 * durée réelle du projet (si terminé, sinon vide) exprimée en minutes
	 */
	private int finalDuration;
	//private ProjectStatus status;
	private int iD;
        private String name;
	/**
	 * Temps du projet en minutes
	 */
	private int estimatedDurationMinutes;
	/**
	 * Temps estimé du projet en hours
	 */
	private float estimatedDurationHours;
	/**
	 * Temps estimé du projet en jours (1 jour = 7h de travail)
	 */
	private float estimatedDurationDays;
        
        private ProjectStatus status;
	/**
	 * /**
	 *  * liste les projets existants
	 *  * /
	 */
	public ProjectsWindow unnamed_ProjectsWindow_;
	/**
	 * /**
	 *  * la fenêtre permet de modifier les données d'un projet
	 *  * /
	 */
	public ProjectWindow unnamed_ProjectWindow_;

	/**
	 * Si le projet est en attente, le démarre (status en cours)
	 * Si le projet est annulé ou terminé, lève une exception
	 */
	/*public void Start() throws LogicError {
		
	}*/

	/**
	 * Annule (si c'est possible) le projet en cours. Le projet ne doit être ni fini, ni annulé. Lève une exception en cas d'erreur.
	 */
	/*public void Cancel() throws LogicError {
		
	}*/

	public void setName(String aName) {
		this.name = aName;
	}

	public String getName() {
		return this.name;
	}

	public void setFinalDuration(int aFinalDuration) {
		this.finalDuration = aFinalDuration;
	}

	public int getFinalDuration() {
		return this.finalDuration;
	}
        
        public ProjectStatus getStatut() {
            return status;
        }
       
        public void setStatut(ProjectStatus st) {
            status = st;
        }

	/*public void setStatus(ProjectStatus aStatus) {
		this.status = aStatus;
	}*/

	/*public ProjectStatus getStatus() {
		return this.status;
	}*/

	public void setID(int aID) {
		this.iD = aID;
	}

	public int getID() {
		return this.iD;
	}

	public void setEstimatedDurationMinutes(int aEstimatedDurationMinutes) {
		this.estimatedDurationMinutes = aEstimatedDurationMinutes;
	}

	public int getEstimatedDurationMinutes() {
		return this.estimatedDurationMinutes;
	}

	public void setEstimatedDurationHours(float aEstimatedDurationHours) {
		this.estimatedDurationHours = aEstimatedDurationHours;
	}

	public float getEstimatedDurationHours() {
		return this.estimatedDurationHours;
	}

	public void setEstimatedDurationDays(float aEstimatedDurationDays) {
		this.estimatedDurationDays = aEstimatedDurationDays;
	}

	public float getEstimatedDurationDays() {
		return this.estimatedDurationDays;
	}
}