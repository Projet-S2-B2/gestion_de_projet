public class Utils{
    public String HashPassword(String pass){
       return ""; 
    }
    public boolean IsPasswordSafe(String pass){

        int longueur = pass.length();
        if (longueur < 10)
        {
            return false;
        }
        int points = 0;
        int points_min = 0;
        int points_maj = 0;
        int points_chiffre = 0;
        int points_char = 0;

        for (int i = 0; i < longueur; i++)
        {
            char lettre = pass.charAt(i);
            if (lettre >= 'a' && lettre <= 'z')
            {
                points += 1;
                points_min = 1;
            }
            else if(lettre >= 'A' && lettre <= 'Z')
            {
                points += 2;
                points_maj = 2;
            }
            else if (lettre >= '0' && lettre <= '9')
            {
                points += 3;
                points_chiffre = 3;
            }
            else
            {
                points += 5;
                points_char = 5;
            }                                                             
        }
        float etape1 = points / longueur;
        int etape2 = points_min + points_maj + points_chiffre + points_char;
        float result = etape1 + etape2;
        return result * longueur > 100;
    }

}