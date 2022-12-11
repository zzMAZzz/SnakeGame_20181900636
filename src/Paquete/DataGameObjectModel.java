package Paquete;

public class DataGameObjectModel{
    
    private int speedGame;
    private int score;
    private boolean dead;

    /**
     * @return the speedGame
     */
    public int getSpeedGame() {
        return speedGame;
    }

    /**
     * @param speedGame the speedGame to set
     */
    public void setSpeedGame(int speedGame) {
        this.speedGame = speedGame;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the dead
     */
    public boolean isDead() {
        return dead;
    }

    /**
     * @param dead the dead to set
     */
    public void setDead(boolean dead) {
        this.dead = dead;
    }

    
}
