package damazo.developer.pruebapixelsoup;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import damazo.developer.pruebapixelsoup.clases.Viaje;

/**
 * Created by Dámazo on 01/06/2016.
 */
public class AdaptadorRV extends RecyclerView.Adapter<AdaptadorRV.ClaseViewHolder>
        implements View.OnClickListener{

    private ArrayList<Viaje> datos;
    private View.OnClickListener clickListener;

    public AdaptadorRV(ArrayList<Viaje> datos) {
        this.datos = datos;
    }

    @Override
    public ClaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_viaje,viewGroup,false);
        view.setOnClickListener(this);
        ClaseViewHolder viewHolder=new ClaseViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ClaseViewHolder holder, int position) {
        Viaje item=datos.get(position);
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
        private TextView tvfolio,tvOperador,tvEstado,tvAccion;
        public ClaseViewHolder(View itemView) {
            super(itemView);
            tvfolio=(TextView)itemView.findViewById(R.id.tvFolio);
            tvOperador=(TextView)itemView.findViewById(R.id.tvOperador);
            tvAccion=(TextView)itemView.findViewById(R.id.tvAccion);
            tvEstado=(TextView)itemView.findViewById(R.id.tvEstado);
        }
        public void bindViewHolder(Viaje item){
            tvfolio.setText("Folio: "+item.getFolio());
            tvOperador.setText("Operador:"+item.getOperador().getName());
            tvAccion.setText("Ultima acción: "+item.getAcciones().getAccion());
            String estado=(item.getCompleted()==true)?"Completado":"En curso";
            tvEstado.setText("Estado: "+estado);
        }
    }
}
