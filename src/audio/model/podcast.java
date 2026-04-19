package audio.model;

public class podcast extends audio{
    private String description;
    private String host;

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println("Description: " + description);
        System.out.println("Host: " + host);
    }

    @Override
    public int getClassification() {
        return getTotalLikes() >= getReproductions() * 0.2 ? 1 : 0;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
