package audio.model;

public class audio {
    private String name;
    private int reproductions;
    private int totalLikes;
    private int classification;
    private double durationMin;

    public void play(){
        this.reproductions++;
    }

    public void like(){
        this.totalLikes++;
    }

    public void displayRecord(){
        System.out.println("Title: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReproductions() {
        return reproductions;
    }

    public void setReproductions(int reproductions) {
        this.reproductions = reproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public double getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(double durationMin) {
        this.durationMin = durationMin;
    }

}