package damazo.developer.pruebapixelsoup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback{
    private GMapsFragment gMapsFragment;
    private Double lat,lon;
    private String nombre,lugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        Toolbar toolbar=(Toolbar)findViewById(R.id.incMaps);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_cancel);

        Bundle extras=getIntent().getExtras();
        lat=Double.parseDouble(extras.getString("lat"));
        lon=Double.parseDouble(extras.getString("lon"));
        nombre=extras.getString("nombre");
        lugar=extras.getString("lugar");
        getSupportActionBar().setTitle(nombre);

        gMapsFragment = gMapsFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.flContenidoMapa,gMapsFragment)
                .commit();
        gMapsFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng coordenadas = new LatLng(lat,lon);
        googleMap.addMarker(new MarkerOptions()
                .position(coordenadas)
                .title(lugar));

        CameraPosition cameraPosition = CameraPosition.builder()
                .target(coordenadas)
                .zoom(10)
                .build();
        googleMap.moveCamera(CameraUpdateFactory.
                newCameraPosition(cameraPosition));
    }
}
