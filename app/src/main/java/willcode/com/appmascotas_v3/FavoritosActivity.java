package willcode.com.appmascotas_v3;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import willcode.com.appmascotas_v3.adapter.MascotaAdaptador;
import willcode.com.appmascotas_v3.pojo.Mascota;

public class FavoritosActivity extends AppCompatActivity {

    private RecyclerView recicladorFav;
    private RecyclerView.LayoutManager layoutManagerFav;
    private RecyclerView.Adapter recyclerAdapterFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarSub);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FavoritosActivity.this, "Regresando", Toast.LENGTH_SHORT).show();
                finish();
            }
        });


        ArrayList<Mascota> datosFav = new ArrayList<Mascota>();

        datosFav.add(new Mascota(R.drawable.perro3, "Akamaru",     0xFF10D94C));
        datosFav.add(new Mascota(R.drawable.perro6, "Reno",      0xFF7a355b));
        datosFav.add(new Mascota(R.drawable.perro5, "Filipo",      0xFF426989));
        datosFav.add(new Mascota(R.drawable.perro1, "Reina",  0xFF00FF00));
        datosFav.add(new Mascota(R.drawable.perro4, "Sancho",  0xFF45694C));

        recicladorFav = (RecyclerView) findViewById(R.id.ReciclerView_RecicladorFavorito);
        layoutManagerFav = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recicladorFav.setLayoutManager(layoutManagerFav);

        recyclerAdapterFav = new MascotaAdaptador(datosFav);
        recicladorFav.setAdapter(recyclerAdapterFav);

    }
}