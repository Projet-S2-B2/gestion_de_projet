package métier;

import java.util.Vector;
import métier.Skill;

/**
 * le technicien est un utilisateur
 */
public class Tech extends User {
	/**
	 * /**
	 *  * un technicien va lister un certain nombre de compétences
	 *  * /
	 */
	public Vector<Skill> skills = new Vector<Skill>();

	/**
	 * Demande la liste des compétences d'un techniciens, avec leur niveau
	 * @return un ensemble de compétences
	 */
	public Skill GetSkills() {
		return this.skills;
	}
}