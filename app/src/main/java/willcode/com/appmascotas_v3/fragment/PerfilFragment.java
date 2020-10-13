package willcode.com.appmascotas_v3.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import willcode.com.appmascotas_v3.R;
import willcode.com.appmascotas_v3.adapter.PerfilAdaptador;
import willcode.com.appmascotas_v3.pojo.Perfil;

public class PerfilFragment extends Fragment {

    public ArrayList<Perfil> datos;

    public PerfilFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        //ReciclerView
        datos = new ArrayList<Perfil>();
        datos.add(new Perfil(R.drawable.perro1,2));
        datos.add(new Perfil(R.drawable.perro1,7));
        datos.add(new Perfil(R.drawable.perro1,5));
        datos.add(new Perfil(R.drawable.perro1,1));
        datos.add(new Perfil(R.drawable.perro1,8));
        datos.add(new Perfil(R.drawable.perro1,3));
        datos.add(new Perfil(R.drawable.perro1,12));
        datos.add(new Perfil(R.drawable.perro1,20));
        datos.add(new Perfil(R.drawable.perro1,14));
        datos.add(new Perfil(R.drawable.perro1, 8));
        datos.add(new Perfil(R.drawable.perro1, 3));
        datos.add(new Perfil(R.drawable.perro1, 12));
        datos.add(new Perfil(R.drawable.perro1,7));
        datos.add(new Perfil(R.drawable.perro1,5));
        datos.add(new Perfil(R.drawable.perro1,1));

        RecyclerView reciclador = (RecyclerView) v.findViewById(R.id.RecyclerView_gridPerfil);
        GridLayoutManager gridPerfil = new GridLayoutManager(getActivity(), 3);
        gridPerfil.setOrientation(GridLayoutManager.VERTICAL);
        reciclador.setLayoutManager(gridPerfil);
        PerfilAdaptador recyclerAdapter = new PerfilAdaptador(datos);
        reciclador.setAdapter(recyclerAdapter);

        return v;
    }
}