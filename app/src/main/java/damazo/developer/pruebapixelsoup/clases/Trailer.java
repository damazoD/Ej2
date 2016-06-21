package damazo.developer.pruebapixelsoup.clases;

/**
 * Created by Dámazo on 01/06/2016.
 */
public class Trailer {
    public String id;
    public String numero_economico;

    public Trailer(String id, String numero_economico) {
        this.id = id;
        this.numero_economico = numero_economico;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumero_economico() {
        return numero_economico;
    }

    public void setNumero_economico(String numero_economico) {
        this.numero_economico = numero_economico;
    }
}
