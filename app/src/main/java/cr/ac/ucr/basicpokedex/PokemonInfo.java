package cr.ac.ucr.basicpokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import cr.ac.ucr.basicpokedex.model.PokeInfoV2;

public class PokemonInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_info);
        PokeInfoV2 poke = receiveData();

        TextView pokeName = findViewById(R.id.tv_infopokeName);
        TextView pokeId = findViewById(R.id.tv_infoPkeId);
        ImageView pokeimg = findViewById(R.id.iv_infoPokeImg);
        ImageView t1 = findViewById(R.id.iv_type1);
        ImageView t2 = findViewById(R.id.iv_type2);
        TextView type1 = findViewById(R.id.twtype1);
        TextView type2 = findViewById(R.id.twtype2);


        Picasso.get().load(poke.getSprites().getFrontDefault()).into(pokeimg);
        pokeName.setText(poke.getName());
        pokeId.setText(String.valueOf(poke.getId()));

        String types [] = {"bug","dark","dragon","electric","fairy","fighting","fire","flying","ghost","grass","ground","ice","normal","poison","psychic","rock","steel","water"};

        for (int i = 0; i<poke.getTypes().size();i++){
            for (int j = 0; j<types.length;j++){
                if(poke.getTypes().get(i).getType().getName().equals(types[j])){
                    if(i==0) {
                        t1.setImageResource(getResources().getIdentifier("ic_" + types[j], "drawable", getPackageName()));
                        type1.setText(types[j]);
                    }else{
                        t2.setImageResource(getResources().getIdentifier("ic_" + types[j], "drawable", getPackageName()));
                        type2.setText(types[j]);
                    }

                }
            }
        }
    }

    public PokeInfoV2 receiveData(){

        Intent intent = getIntent();
        String JsonData = intent.getStringExtra("pokemon");
        PokeInfoV2 poke = new Gson().fromJson(JsonData,PokeInfoV2.class);
        return poke;
    }
}