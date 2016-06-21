package damazo.developer.pruebapixelsoup.clases;

/**
 * Created by Dámazo on 01/06/2016.
 */
public class Patio {
    public String start_id;
    public String start_name;
    public String end_id;
    public String end_name;

    public Patio(String start_id, String start_name, String end_id, String end_name) {
        this.start_id = start_id;
        this.start_name = start_name;
        this.end_id = end_id;
        this.end_name = end_name;
    }

    public String getStart_id() {
        return start_id;
    }

    public void setStart_id(String start_id) {
        this.start_id = start_id;
    }

    public String getStart_name() {
        return start_name;
    }

    public void setStart_name(String start_name) {
        this.start_name = start_name;
    }

    public String getEnd_id() {
        return end_id;
    }

    public void setEnd_id(String end_id) {
        this.end_id = end_id;
    }

    public String getEnd_name() {
        return end_name;
    }

    public void setEnd_name(String end_name) {
        this.end_name = end_name;
    }
}
