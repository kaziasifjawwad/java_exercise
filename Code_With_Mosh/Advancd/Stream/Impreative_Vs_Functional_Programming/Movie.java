package Code_With_Mosh.Advancd.Stream.Impreative_Vs_Functional_Programming;

public class Movie {
    private int likes;
    private String title;

    public Movie(int likes, String title) {
        this.likes = likes;
        this.title = title;
    }


    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
