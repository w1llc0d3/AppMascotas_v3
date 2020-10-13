package willcode.com.appmascotas_v3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import willcode.com.appmascotas_v3.R;
import willcode.com.appmascotas_v3.pojo.Mascota;

public class MascotaAdaptador extends RecyclerView.Adapter<mascotaViewHolder>{

    private ArrayList<Mascota> item;

    public MascotaAdaptador(ArrayList<Mascota> item){
        this.item = item;
    }


    @Override
    public mascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        mascotaViewHolder mascota = new mascotaViewHolder(v);
        return mascota;
    }

    @Override
    public void onBindViewHolder(mascotaViewHolder mascotaHolder, int position) {
        mascotaHolder.nombre.setText(this.item.get(position).getNombre());
        mascotaHolder.foto.setImageResource(this.item.get(position).getFoto());
        mascotaHolder.foto.setBackgroundColor(this.item.get(position).getColor());
    }

    @Override
    public int getItemCount() {
        return this.item.size();
    }
}
