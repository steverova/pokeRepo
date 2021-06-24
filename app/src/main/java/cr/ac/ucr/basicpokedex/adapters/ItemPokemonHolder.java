package cr.ac.ucr.basicpokedex.adapters;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import cr.ac.ucr.basicpokedex.R;

public class ItemPokemonHolder extends RecyclerView.ViewHolder {

    TextView poke_Name;
    TextView poke_Id;
    ImageView poke_Image;
    TextView pokeq;
    Button binfo;

    public ItemPokemonHolder(@NonNull View itemView) {
        super(itemView);
        poke_Name = itemView.findViewById(R.id.tv_pokename);
        poke_Id = itemView.findViewById(R.id.tvId);
        poke_Image = itemView.findViewById(R.id.img_poke);
        pokeq = itemView.findViewById(R.id.tvn);
        binfo = itemView.findViewById(R.id.btnInfo);
    }
}
