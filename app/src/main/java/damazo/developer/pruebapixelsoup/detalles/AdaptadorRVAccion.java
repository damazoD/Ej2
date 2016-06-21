package damazo.developer.pruebapixelsoup.detalles;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

import damazo.developer.pruebapixelsoup.clases.Acciones;
import damazo.developer.pruebapixelsoup.R;


/**
 * Created by Dámazo on 01/06/2016.
 */
public class AdaptadorRVAccion extends RecyclerView.Adapter<AdaptadorRVAccion.ClaseViewHolder>
        implements View.OnClickListener{

    private ArrayList<Acciones> datos;
    private View.OnClickListener clickListener;

    public AdaptadorRVAccion(ArrayList<Acciones> datos) {
        this.datos = datos;
    }

    @Override
    public ClaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_accion,viewGroup,false);
        view.setOnClickListener(this);
        ClaseViewHolder viewHolder=new ClaseViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ClaseViewHolder holder, int position) {
        Acciones item=datos.get(position);
        holder.bindViewHolder(item);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    @Override
    public void onClick(View v) {
        if(clickListener != null){
            clickListener.onClick(v);
        }

    }
    public void mySetOnClickListener(View.OnClickListener listener){
        this.clickListener=listener;
    }


    public static class ClaseViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNombre,tvTimezone,tvFecha,tvEstado;
        public ClaseViewHolder(View itemView) {
            super(itemView);
            tvNombre=(TextView)itemView.findViewById(R.id.tvNombre);
            tvTimezone=(TextView)itemView.findViewById(R.id.tvTimezone);
            tvFecha=(TextView)itemView.findViewById(R.id.tvFechaAccion);
            tvEstado=(TextView)itemView.findViewById(R.id.tvEstadoAccion);
        }
        public void bindViewHolder(Acciones item){
            tvNombre.setText("Nombre: "+item.getAccion());
            tvTimezone.setText("Zona: "+item.getTimezone());
            tvFecha.setText("Ultima acción: "+item.getCreated());
            tvEstado.setText("Estado: "+item.getStatus());
        }
    }
}
