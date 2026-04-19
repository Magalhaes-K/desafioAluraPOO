package audio.model;

public class favorite {

    public void rating(audio audio){
        if (audio.getClassification() == 1){
            System.out.println("Big hits");
        } else {
            System.out.println("Trending");
        }
    }
}
