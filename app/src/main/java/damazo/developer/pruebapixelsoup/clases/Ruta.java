package damazo.developer.pruebapixelsoup.clases;

/**
 * Created by Dámazo on 01/06/2016.
 */
public class Ruta {
    public String id;
    public Locations[] locations;
    public String name;

    public Ruta(String id, Locations[] locations, String name) {
        this.id = id;
        this.locations = locations;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Locations[] getLocations() {
        return locations;
    }

    public void setLocations(Locations[] locations) {
        for (int i = 0; i <locations.length ; i++) {
            this.locations[i] = locations[i];
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
