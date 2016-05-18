package com.example.linbin.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://139.196.173.191:42000/blb-api/")
                .addConverterFactory(GsonConverterFactory.create())
        .build();

        IProductGet productGet = retrofit.create(IProductGet.class);
        Call<ProductBean> call = productGet.getProduct("http://139.196.173.191:42000/blb-api/product");

        call.enqueue(new Callback<ProductBean>() {
            @Override
            public void onResponse(Call<ProductBean> call, Response<ProductBean> response) {
                Log.e("linbin", "111111");
                ProductBean bean = response.body();
                Log.e("linbin",bean.getTotalCount() + "");
            }

            @Override
            public void onFailure(Call<ProductBean> call, Throwable t) {
                Log.e("linbin","2222222");
                Log.e("linbin",t.toString());
            }
        });

    }
}
