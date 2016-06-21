package damazo.developer.pruebapixelsoup;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import damazo.developer.pruebapixelsoup.clases.Viaje;

/**
 * Created by Dámazo on 01/06/2016.
 */
public class GsonViajeParser {
    public List<Viaje> leerFlujoJson(InputStream in) throws IOException {
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
        List<Viaje> viajes = new ArrayList<>();

        reader.beginArray();
        int num=0;
        while (reader.hasNext()) {
            // Lectura de objetos
            Viaje viaje = gson.fromJson(reader, Viaje.class);
            viajes.add(viaje);
            num++;
        }
        reader.endArray();
        reader.close();
        return viajes;
    }
}
