package org.academicreport.model;


public class ScoreModel {
    /**
     * Properties
     */
    private String subject, score;
    private int credit;

    /**
     * Constructor
     */
    public ScoreModel(){
    }

    public ScoreModel(String subject, String score, int credit) {

        this.subject = subject;
        this.score = score;
        this.credit = credit;

    }

    /**
     * Set Subject
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Get Subject
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Set Score
     * @param score
     */
    public void setScore(String score) {
        this.score = score;
    }

    /**
     * Get Score
     * @return score
     */
    public String getScore() {
        return score;
    }

    /**
     * Set Credit
     * @param credit
     */
    public void setCredit(int credit) {
        this.credit = credit;
    }

    /**
     * Get Credit
     * @return credit
     */
    public int getCredit() {
        return credit;
    }
}
