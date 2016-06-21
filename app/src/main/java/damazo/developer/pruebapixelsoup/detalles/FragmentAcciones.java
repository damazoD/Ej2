package damazo.developer.pruebapixelsoup.detalles;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import damazo.developer.pruebapixelsoup.clases.Acciones;
import damazo.developer.pruebapixelsoup.MapsActivity;
import damazo.developer.pruebapixelsoup.R;

/**
 * Created by Dámazo on 03/06/2016.
 */
public class FragmentAcciones extends Fragment {
    private RecyclerView rvListaAcciones;
    private ArrayList<Acciones> acciones;
    private static AdaptadorRVAccion adapter;


    public FragmentAcciones() {
    }

    public static FragmentAcciones newInstance(){
        return new FragmentAcciones();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_acciones,container,false);
        rvListaAcciones=(RecyclerView)view.findViewById(R.id.rvListaAcciones);
        acciones=new ArrayList<Acciones>();
        for (int i=0;i<10;i++) {
            acciones.add(new Acciones("5747f3df0a90687b4dc30444",null,null,"America/Mexico_City","20160527T021438",
                    new String[]{"-99.1170181","19.2730206"},"SP","Salida Patio",17));
        }

        adapter=new AdaptadorRVAccion(acciones);
        rvListaAcciones.setAdapter(adapter);
        rvListaAcciones.setHasFixedSize(true);
        rvListaAcciones.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

        adapter.mySetOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lat="-99.1170181";
                String lon="19.2730206";
                String nombre="Salida Patio";
                String lugar="America/Mexico_City";
                Intent intent=new Intent(getContext(), MapsActivity.class);
                intent.putExtra("lat",lat).putExtra("lon",lon)
                        .putExtra("nombre",nombre).putExtra("lugar",lugar);
                startActivity(intent);
            }
        });
        return view;
    }
}
