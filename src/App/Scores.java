package App;

import java.util.ArrayList;
import java.util.Collections;

public class Scores  {

    public static final int MAX_SCORES = 3;
    private ArrayList<Score> scoresList = new ArrayList();

    public ArrayList<Score> getScoresList() {
        return scoresList;
    }

    public void setScoresList(ArrayList<Score> scoresList) {
        this.scoresList = scoresList;
    }

    public void addScore(Score score) {
        scoresList.add(score);
        Collections.sort(scoresList);
        if(scoresList.size() > MAX_SCORES) {
            scoresList.remove(scoresList.size() - 1);
        }
    }

    public int getPosition(Score score) {
        return scoresList.indexOf(score);
    }
    
    @Override
    public String toString() {
        String result = "";
        for(int i=0; i<scoresList.size(); i++) {
            Score score = scoresList.get(i);
            result += (i+1) + "º: " + score.getName() + ": " + score.getPoints() + "\n";
        }
        return result;
    }
    
    public String NombretoString(int posicion) {
        String result = "";
        Score score = scoresList.get(posicion);
        result = score.getName();
        return result;
    }
    
    public String PuntajetoString(int posicion) {
        String result = "";
        Score score = scoresList.get(posicion);
        int p = score.getPoints();
        if (p<10){
            result = "000"+p;
        } else if (p<100){
            result = "00"+p;
        } else if (p<1000){
            result = "0"+p;
        } else {
            result = ""+p;
        }
        return result;
    }
       
}