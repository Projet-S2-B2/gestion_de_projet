package metier;

import java.util.Vector;
import metier.Skill;

/**
 * le technicien est un utilisateur
 */
public class Tech extends User {
	/**
	 * /**
	 *  * un technicien va lister un certain nombre de compétences
	 *  * /
	 */
	public Vector<Skill> skills = new Vector<>();

    public Tech(int id) {
        super(id);
    }

	/**
	 * Demande la liste des compétences d'un techniciens, avec leur niveau
	 * @return un ensemble de compétences
	 */
	public Vector<Skill> GetSkills() {
		return this.skills;
	}
}