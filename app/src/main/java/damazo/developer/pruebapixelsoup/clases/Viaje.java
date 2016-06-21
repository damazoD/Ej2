package damazo.developer.pruebapixelsoup.clases;

import java.util.ArrayList;

/**
 * Created by Dámazo on 01/06/2016.
 */
public class Viaje extends ArrayList<Viaje> {

    public String _id;
    public Usuario user;
    public Ruta ruta;
    public Patio patio;
    public Truck truck;
    public Trailer trailer;
    public Operador operador;
    public String schedule;
    public Boolean completed;
    public String created;
    public Acciones acciones;
    public Referencias referencias;
    public String[] survey;
    public String folio;

    public Viaje(String _id, Usuario user, Ruta ruta, Patio patio, Truck truck, Trailer trailer, Operador operador, String schedule, Boolean completed, String created, Acciones acciones, Referencias referencias, String[] survey, String folio) {
        this._id = _id;
        this.user = user;
        this.ruta = ruta;
        this.patio = patio;
        this.truck = truck;
        this.trailer = trailer;
        this.operador = operador;
        this.schedule = schedule;
        this.completed = completed;
        this.created = created;
        this.acciones = acciones;
        this.referencias = referencias;
        this.survey = survey;
        this.folio = folio;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Patio getPatio() {
        return patio;
    }

    public void setPatio(Patio patio) {
        this.patio = patio;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Acciones getAcciones() {
        return acciones;
    }

    public void setAcciones(Acciones acciones) {
        this.acciones = acciones;
    }

    public Referencias getReferencias() {
        return referencias;
    }

    public void setReferencias(Referencias referencias) {
        this.referencias = referencias;
    }

    public String[] getSurvey() {
        return survey;
    }

    public void setSurvey(String[] survey) {
        this.survey = survey;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }
}
