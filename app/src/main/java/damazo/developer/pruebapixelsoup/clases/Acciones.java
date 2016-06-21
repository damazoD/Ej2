package damazo.developer.pruebapixelsoup.clases;

/**
 * Created by Dámazo on 01/06/2016.
 */
public class Acciones {
    public String id;
    public String[] comentario;
    public String[] imagen;
    public String timezone;
    public String created;
    public String[] coordenadas;
    public String status;
    public String accion;
    public int idAccion;

    public Acciones(String id, String[] comentario, String[] imagen, String timezone, String created, String[] coordenadas, String status, String accion, int idAccion) {
        this.id = id;
        this.comentario = comentario;
        this.imagen = imagen;
        this.timezone = timezone;
        this.created = created;
        this.coordenadas = coordenadas;
        this.status = status;
        this.accion = accion;
        this.idAccion = idAccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getComentario() {
        return comentario;
    }

    public void setComentario(String[] comentario) {
        this.comentario = comentario;
    }

    public String[] getImagen() {
        return imagen;
    }

    public void setImagen(String[] imagen) {
        this.imagen = imagen;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String[] coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public int getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(int idAccion) {
        this.idAccion = idAccion;
    }
}
