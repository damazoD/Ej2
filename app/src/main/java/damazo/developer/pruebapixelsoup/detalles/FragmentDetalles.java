package damazo.developer.pruebapixelsoup.detalles;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import damazo.developer.pruebapixelsoup.MainActivity;
import damazo.developer.pruebapixelsoup.R;
import damazo.developer.pruebapixelsoup.clases.Viaje;

/**
 * Created by Dámazo on 03/06/2016.
 */
public class FragmentDetalles extends Fragment {
    private TextView tvUsuario,tvRuta,tvPatioI,tvPatioF,tvTruck,tvTrailer,tvOperador,tvHrViaje,tvFechaCreacion,tvEstadoViaje,tvColor;

    public FragmentDetalles() {
    }
    public static FragmentDetalles newInstance(){
        return new FragmentDetalles();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_detalles,container,false);
        tvUsuario=(TextView)view.findViewById(R.id.tvUsuario);
        tvRuta=(TextView)view.findViewById(R.id.tvRuta);
        tvPatioI=(TextView)view.findViewById(R.id.tvPatioI);
        tvPatioF=(TextView)view.findViewById(R.id.tvPatioF);
        tvTruck=(TextView)view.findViewById(R.id.tvTruck);
        tvTrailer=(TextView)view.findViewById(R.id.tvTrailer);
        tvOperador=(TextView)view.findViewById(R.id.tvOperador);
        tvHrViaje=(TextView)view.findViewById(R.id.tvHrViaje);
        tvFechaCreacion=(TextView)view.findViewById(R.id.tvFechaCreacion);
        tvEstadoViaje=(TextView)view.findViewById(R.id.tvEstadoViaje);
        tvColor=(TextView)view.findViewById(R.id.tvColor);

        ArrayList<Viaje> itemViaje= MainActivity.viajesC;


        return view;
    }
}
