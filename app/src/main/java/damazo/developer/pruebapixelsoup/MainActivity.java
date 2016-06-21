package damazo.developer.pruebapixelsoup;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import damazo.developer.pruebapixelsoup.clases.Acciones;
import damazo.developer.pruebapixelsoup.clases.Locations;
import damazo.developer.pruebapixelsoup.clases.Operador;
import damazo.developer.pruebapixelsoup.clases.Patio;
import damazo.developer.pruebapixelsoup.clases.Referencias;
import damazo.developer.pruebapixelsoup.clases.Ruta;
import damazo.developer.pruebapixelsoup.clases.Trailer;
import damazo.developer.pruebapixelsoup.clases.Truck;
import damazo.developer.pruebapixelsoup.clases.Usuario;
import damazo.developer.pruebapixelsoup.clases.Viaje;
import damazo.developer.pruebapixelsoup.detalles.ViajeDetalles;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvListaViajes;
    public static ArrayList<Viaje> viajesC;
    private static AdaptadorRV adapter;
    public HttpURLConnection con ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar)findViewById(R.id.tbLista);
        setSupportActionBar(toolbar);

        rvListaViajes=(RecyclerView)findViewById(R.id.rvListado);
        CollapsingToolbarLayout collapsingTBL=(CollapsingToolbarLayout)findViewById(R.id.ctlLayout);
        collapsingTBL.setTitle("Lista de Viajes");
        viajesC=new ArrayList<Viaje>();
       /*
        Comprobar la disponibilidad de la Red
         */
       /* try {
            ConnectivityManager connMgr = (ConnectivityManager)
                    getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isConnected()) {
                new JsonTask().execute(new URL("http://tvhl.mx:3000/trips"));
            } else {
                Toast.makeText(this, "Error de conexión", Toast.LENGTH_LONG).show();
            }
        }catch (MalformedURLException e) {
            e.printStackTrace();
        }
*/

        //******Llenado de los items
        //viajes.clear();
        for (int i=0;i<10;i++) {
            viajesC.add(new Viaje(
                    "5747f3c40a90687b4dc30440",
                    new Usuario("5679e42faade031d063da74d","Luis Gomez"),
                    new Ruta("568e8224aade031d063daa4e",
                                new Locations[]{
                                        new Locations("568e8224aade031d063daa52","0","5679f44eaade031d063da76a"),
                                        new Locations("568e8224aade031d063daa51","1","5679f3e4aade031d063da769"),
                                        new Locations("568e8224aade031d063daa50","0","5679f3e4aade031d063da769"),
                                        new Locations("568e8224aade031d063daa4f","1","5679f44eaade031d063da76a")},
                            "Loreal-Centrex"),
                    new Patio("5679f071aade031d063da761","Pta. Cosbel","5679f071aade031d063da761","Pta. Cosbel"),
                    new Truck("5679e971aade031d063da751","Eco1000"),
                    new Trailer("573fc0a8e879314a358f4b48","ECO2101"),
                    new Operador("573fbf86e879314a358f4b46","Arturo Pozos","apozos"),
                    "13:03 hrs",
                    true,
                    "2016-05-27",
                    new Acciones("57480def0a90687b4dc30453",null,null,"America/Mexico_City","20160527T040549",
                            new String[]{"-99.2096935","19.6096498"},"AC","Arribo Carga",18),
                    new Referencias("5747f3c40a90687b4dc30441","700046179","FOLIO"),
                    null,
                    "700046179"));
        }

        adapter=new AdaptadorRV(viajesC);
        rvListaViajes.setAdapter(adapter);
        rvListaViajes.setHasFixedSize(true);
        rvListaViajes.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapter.mySetOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ViajeDetalles.class);
                intent.putExtra("codigo",rvListaViajes.getChildAdapterPosition(v));
                startActivity(intent);
            }
        });

    }

    public class JsonTask extends AsyncTask<URL,Void,List<Viaje>>{

        @Override
        protected List<Viaje> doInBackground(URL... params) {
            List viajes=null;

            try{
                con=(HttpURLConnection)params[0].openConnection();
                con.setConnectTimeout(15000);
                con.setReadTimeout(10000);
                int statuscode=con.getResponseCode();
                if(statuscode != 200){
                    viajes=new ArrayList();
                    viajes.add(new Viaje(null,null,null,null,null,null,null,null,null,null,null,null,null,null));
                }else{
                    InputStream in = new BufferedInputStream(con.getInputStream());
                    GsonViajeParser parser = new GsonViajeParser();
                    viajes = parser.leerFlujoJson(in);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                con.disconnect();
            }
            return viajes;
        }

        @Override
        protected void onPostExecute(List<Viaje> viaje) {
            super.onPostExecute(viaje);
            if(viaje!=null) {
                Log.d("datos",viaje.get(1).toString());
            }else{
                Log.d("error json", "Ocurrió un error de Parsing Json");
            }
        }
    }


}
