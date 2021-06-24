package cr.ac.ucr.basicpokedex.Interface;
import java.util.List;

import cr.ac.ucr.basicpokedex.model.PokeInfoV2;
import cr.ac.ucr.basicpokedex.model.Pokeinfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokeApiInterface {

    @GET("?limit=151")
    Call<Pokeinfo> getPokesInfo();

    @GET("{name}")
    Call<PokeInfoV2> getPokeInfo(@Path("name") String name );
}
