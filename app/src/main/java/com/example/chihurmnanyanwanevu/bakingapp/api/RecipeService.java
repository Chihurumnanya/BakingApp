package com.example.chihurmnanyanwanevu.bakingapp.api;

import com.example.chihurmnanyanwanevu.bakingapp.data.models.Recipe;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Chihurumnanya
 */

public interface RecipeService {

    @GET("topher/2017/May/59121517_baking/baking.json")
    Observable<List<Recipe>> getRecipes();

}
