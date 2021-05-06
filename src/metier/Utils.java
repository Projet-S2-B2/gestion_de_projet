package metier;

public class Utils{
        /**
	 * 
	 *  Fournit un hachage du mot de passe. L'algorithme est basique : on fait du HEX : on prend chaque caractère de la chaîne d'entrée, et c'est le code hexa qui est stocké.
	 * Exemple : si le password est "AB1", alors le hach est "414231". le retour est bien une chaîne
	 *  
	 * @param aPass un mot de passe à "hacher"
	 * @return la valeur hachée du paramètre
	 */
    public String HashPassword(String aPass){
        int c;
        char s=' ';
        StringBuilder buff = new StringBuilder(aPass.length()); 
        for (int i = 0; i < aPass.length(); i++) { 
            c=aPass.charAt(i); 
            buff.append(Integer.toHexString(c)).append(s); 
        } 
        return buff.toString();
    }
    public boolean IsPasswordSafe(String pass){
        return false;

    }
}