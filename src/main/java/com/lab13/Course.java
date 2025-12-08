package com.lab13;

public class Course {

    // Variables

    private String Title;
    private int duration;
    private String professor;

    /**
     * 
     * @param Title
     * @param duration
     * @param professor
     * 
     */

    // Constructores

   public Course(String Title, int duration, String professor) {
    if (professor == null || professor.isEmpty()) {
        throw new IllegalArgumentException("Professor cannot be null or empty");
    }
    this.Title = Title;
    this.duration = duration;
    this.professor = professor;
}

    public Course(String Title, int duration) {
        this.Title = Title;
        this.duration = duration;
        this.professor = "unassigned";
    }

    // Getters

    public String getTitle() {
        return Title;
    }

    public int getduration() {
        return duration;
    }

    public String getProfessor() {
        return professor;
    }

    // Setters

    public void setTitle(String title) {
        this.Title = title;

    }

    public void setduration(int duration) {
        this.duration = duration;
    }

    public void setprofessor(String professor) {
        this.professor = professor;
    }

    // Showinformation()

   
  public String showInformation() {
    return "Course: " + Title + "\n"
         + "Duration: " + duration + " hours\n"
         + "Professor: " + professor;
}


  

    

    

}
