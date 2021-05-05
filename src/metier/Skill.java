package metier;

/**
 * Représente une compétence
 */
public class Skill {
    
    private Tech technicien;
    
	/**
	 * nom de la compétence
	 */
	private String name;
	/**
	 * Niveau de la compétence
	 */
	private String level;
	

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLevel() {
		return this.level;
	}
}
