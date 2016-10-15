package pl.homik.model;

/**
 * Created by Pawel on 2016-10-15.
 */
public class Gif {

    private String name;

    private String username;

    private boolean favorite;

    public Gif(String gifFilename, String gifOwnerName, boolean favorite) {
        this.name = gifFilename;
        this.username = gifOwnerName;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }
    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
