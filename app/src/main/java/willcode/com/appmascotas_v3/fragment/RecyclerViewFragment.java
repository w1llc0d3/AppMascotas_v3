package willcode.com.appmascotas_v3.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import willcode.com.appmascotas_v3.R;
import willcode.com.appmascotas_v3.adapter.MascotaAdaptador;
import willcode.com.appmascotas_v3.pojo.Mascota;

public class RecyclerViewFragment extends Fragment {

    private RecyclerView reciclador;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter recyclerAdapter;

    public RecyclerViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);
        ArrayList<Mascota> datos = new ArrayList<Mascota>();

        datos.add(new Mascota(R.drawable.perro1, "Reina",  0xFF00FF00));
        datos.add(new Mascota(R.drawable.perro2, "Loco",     0xFFa8285c));
        datos.add(new Mascota(R.drawable.perro3, "Akamaru",     0xFF10D94C));
        datos.add(new Mascota(R.drawable.perro4, "Sancho",  0xFF45694C));
        datos.add(new Mascota(R.drawable.perro5, "Filipo",      0xFF426989));
        datos.add(new Mascota(R.drawable.perro6, "Perro",      0xFF7a355b));
        datos.add(new Mascota(R.drawable.perro7, "Pepe",      0xFFd1c1fc));
        datos.add(new Mascota(R.drawable.perro8, "Ronaldo",     0xFF962489));

        reciclador = (RecyclerView) v.findViewById(R.id.ReciclerView_Reciclador);
        layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        reciclador.setLayoutManager(layoutManager);

        recyclerAdapter = new MascotaAdaptador(datos);
        reciclador.setAdapter(recyclerAdapter);
        return v;
    }

}
