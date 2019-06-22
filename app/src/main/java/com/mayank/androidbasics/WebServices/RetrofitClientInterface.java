package com.mayank.androidbasics.WebServices;

import com.mayank.androidbasics.ServerResponse.GetBasicsCategory;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

import static com.mayank.androidbasics.Utility.Constants.BASE_URL;

/**
 * Created by MAYANK SINGH on 23-06-2019.
 */
public class RetrofitClientInterface {

    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public interface GetBasicsData {

        @GET("/basicscategory.php")
        Call<List<GetBasicsCategory>> getAllDetails();
    }
}
