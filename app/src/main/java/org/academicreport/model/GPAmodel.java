package org.academicreport.model;

/**
 * Created by L on 16/08/2015.
 */
public class GPAmodel {
    /**
     * Properties
     */
    private double gpa;

    /**
     * Constructor
     */
    public GPAmodel() {
    }

    public GPAmodel(double gpa) {
        this.gpa = gpa;
    }

    /**
     * Set GPA
     * @param gpa
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * Get GPA
     * @return gpa
     */
    public double getGpa() {
        return gpa;
    }
}
