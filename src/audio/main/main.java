package audio.main;

import audio.model.favorite;
import audio.model.music;
import audio.model.podcast;

public class main {
    public static void main(String[] args) {
        favorite Favorite = new favorite();

        music Music1 = new music();
        Music1.setName("Wanna Be Startin' Somethin'");
        Music1.setArtist("Michael Jackson");
        Music1.setAlbum("Thriller");
        Music1.setYearRelease(1982);
        Music1.setGenre("R&B, Pop, Rock");
        Music1.setDurationMin(6.5);
        Music1.setReproductions(120000000);

        System.out.println("Music");
        Music1.displayRecord();
        Favorite.rating(Music1);

        System.out.println("______________________");

        podcast Podcast1 = new podcast();
        Podcast1.setName("FABIO AKITA - Flow #588");
        Podcast1.setDescription("A inteligência artificial vai roubar seu emprego?");
        Podcast1.setHost("Flow Podcast");
        Podcast1.setDurationMin(284.12);
        Podcast1.setReproductions(327000);
        Podcast1.setTotalLikes(20000);

        System.out.println("Podcast");
        Podcast1.displayRecord();
        Favorite.rating(Podcast1);

    }
}
