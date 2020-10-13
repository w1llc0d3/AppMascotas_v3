package willcode.com.appmascotas_v3.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import willcode.com.appmascotas_v3.R;

public class mascotaViewHolder extends RecyclerView.ViewHolder {

    TextView nombre;
    ImageView foto;

    public mascotaViewHolder(View itemView) {
        super(itemView);
        nombre = (TextView) itemView.findViewById(R.id.TextView_Nombre);
        foto = (ImageView) itemView.findViewById(R.id.ImageViewMascota);
    }
}
