package damazo.developer.pruebapixelsoup.clases;

/**
 * Created by Dámazo on 01/06/2016.
 */
public class Locations {
    public String id;
    public String tipo;
    public String location;

    public Locations(String id, String tipo, String location) {
        this.id = id;
        this.tipo = tipo;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
