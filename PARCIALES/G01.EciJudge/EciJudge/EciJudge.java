import java.util.HashMap;
/**
 * ECIJude
 *
 * @author ECI
 * @version 2020-1a
 * 
 * 
 */
public class EciJudge{
    private HashMap<String,Contest> contests;
    private HashMap<String,Problem> problems;
    private HashMap<Integer,Student> students;
    private HashMap<String,Team> teams;
    
    public EciJudge(){
    }

    /** 
    * @param contestName es el nombre de la competencia a la cual le pertenece el puntaje
    * @param String teamName es el nombre del equipo del cual se obtuvo el puntaje
    * @return el puntaje acumulado por el equipo en la competencia especifica
    */
    public int scoreByContest(String contestName,String teamName){
    int puntaje=0;
    puntaje=puntaje+getScore();
    return puntaje;
    
    }
    
    public int getScore(){
        return Problem.score;
    }
}