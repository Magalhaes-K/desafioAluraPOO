package audio.model;

public class music extends audio{
    private String artist;
    private String album;
    private String genre;
    private int yearRelease;

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println("Artist: " + artist);
        System.out.println("Album: " + album);
        System.out.println("Genre: " + genre);
        System.out.println("Year Release: " + yearRelease);
    }

    @Override
    public int getClassification() {
        return (getReproductions() > 10000) ? 1 : 0;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

}
