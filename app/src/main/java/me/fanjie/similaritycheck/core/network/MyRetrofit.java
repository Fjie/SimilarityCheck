package me.fanjie.similaritycheck.core.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by fanji on 2016/11/13.
 */

public class MyRetrofit {

    private static final String BASE_URL = "https://apicn.faceplusplus.com/v2/";
    private static MyRetrofit myRetrofit;
    private Retrofit retrofit;



    public static MyRetrofit getInstance() {
        if(myRetrofit == null){
            myRetrofit = new MyRetrofit();
        }
        return myRetrofit;
    }

    public MyRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


}
