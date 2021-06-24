package cr.ac.ucr.basicpokedex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import cr.ac.ucr.basicpokedex.Interface.PokeApiInterface;
import cr.ac.ucr.basicpokedex.adapters.ListaPokemonAdapter;
import cr.ac.ucr.basicpokedex.model.PokeInfoV2;
import cr.ac.ucr.basicpokedex.model.Pokemon;
import cr.ac.ucr.basicpokedex.model.Pokeinfo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycledpokelist;
    Pokeinfo info;
    List<Pokemon> pokelist;
    List<PokeInfoV2> pokelistinfo;
    List<PokeInfoV2> pokelistinfotest;

    public MainActivity() {
        pokelistinfo = new ArrayList<>();
        pokelistinfotest = new ArrayList<>();
        pokelist = new ArrayList<>();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycledpokelist = findViewById(R.id.listpokerecycler);
        getListPokemon();
    }

    @Override
    protected void onResume() {
        super.onResume();
        getListPokemon();

    }

    private List<Pokemon> getListPokemon(){
        pokelist.clear();
        pokelistinfo.clear();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/pokemon/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PokeApiInterface api = retrofit.create(PokeApiInterface.class);
        Call<Pokeinfo> call = api.getPokesInfo();
        call.enqueue(new Callback <Pokeinfo>() {
            @Override
            public void onResponse(Call<Pokeinfo> call, Response<Pokeinfo> response) {
                if(response.isSuccessful()){
                    info = response.body();
                        pokelist = info.getResults();
                    for (int i = 0; i<pokelist.size();i++){
                        getPokemon(pokelist.get(i).getName());
                    }

                }else{
                    System.out.println(response.errorBody());
                }
            }
            @Override
            public void onFailure(Call<Pokeinfo> call, Throwable t) {
                t.printStackTrace();
            }
        });

        return pokelist;
    }

    private void getPokemon(String name){

        pokelistinfo.clear();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/pokemon-form/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PokeApiInterface api = retrofit.create(PokeApiInterface.class);
        Call<PokeInfoV2> call = api.getPokeInfo(name);
        call.enqueue(new Callback <PokeInfoV2>() {
            @Override
            public void onResponse(Call<PokeInfoV2> call, Response<PokeInfoV2> response) {
                if(response.isSuccessful()){

                    pokelistinfo.add(response.body());

                    if(pokelistinfo.size()==151){

                        ListaPokemonAdapter adapter = new ListaPokemonAdapter(pokelistinfo, getApplicationContext());
                        adapter.notifyDataSetChanged();
                        recycledpokelist.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        recycledpokelist.setAdapter(adapter);

                    }

                }else{
                    System.out.println(response.errorBody());
                }
            }
            @Override
            public void onFailure(Call<PokeInfoV2> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }

}