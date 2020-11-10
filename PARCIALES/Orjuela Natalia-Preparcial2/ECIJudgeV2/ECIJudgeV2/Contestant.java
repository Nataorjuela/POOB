import java.util.ArrayList;

public abstract class Contestant implements Sortable {
    private String name;
    private ArrayList<Submission> submissions;
    /**
     * @see Sortable#weightedScore(Contest)
     * 
     */
    public double weightedScore(Contest c) {
        /**if(c.getenrolled().contains(this))*/
        double puntaje=0;
        for(int i =0;i<submissions.size();i++){
            puntaje=puntaje+submissions.get(i).score(c);
    }
    return puntaje;
    
   }
   
}