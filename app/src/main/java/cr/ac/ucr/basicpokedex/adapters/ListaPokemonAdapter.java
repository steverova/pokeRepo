package cr.ac.ucr.basicpokedex.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.StrictMode;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import cr.ac.ucr.basicpokedex.PokemonInfo;
import cr.ac.ucr.basicpokedex.R;
import cr.ac.ucr.basicpokedex.model.PokeInfoV2;
import cr.ac.ucr.basicpokedex.model.Pokeinfo;
import cr.ac.ucr.basicpokedex.model.Pokemon;

public class ListaPokemonAdapter extends RecyclerView.Adapter<ItemPokemonHolder> {

    private List<PokeInfoV2> pokelist;
    public int num;
    private Context context;

    public ListaPokemonAdapter(List<PokeInfoV2> pokelist, Context context) {
        this.pokelist = pokelist;
        this.context=context;
        num = 0;

    }

    @NonNull
    @Override
    public ItemPokemonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater =  LayoutInflater.from(parent.getContext());
        View itempoke = inflater.inflate(R.layout.item_poke, parent, false);
        ItemPokemonHolder pokeholder = new ItemPokemonHolder(itempoke);
        return pokeholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemPokemonHolder holder, int position) {

        final PokeInfoV2 currentPokemon = pokelist.get(position);
        Picasso.get().load(currentPokemon.getSprites().getFrontDefault()).into(holder.poke_Image);
        holder.poke_Name.setText(currentPokemon.getName());
        holder.poke_Id.setText(String.valueOf(currentPokemon.getId()));


        holder.binfo.setOnClickListener(view ->{

            Intent i = new Intent(context,PokemonInfo.class);
            i.putExtra("pokemon", new Gson().toJson(currentPokemon));
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);

        });

    }

    @Override
    public int getItemCount() {
        return pokelist.size();
    }

}
