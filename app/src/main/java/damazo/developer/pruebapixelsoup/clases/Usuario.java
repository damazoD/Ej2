package damazo.developer.pruebapixelsoup.clases;

/**
 * Created by Dámazo on 01/06/2016.
 */
public class Usuario {
    public String id;
    public String displayName;

    public Usuario(String id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
