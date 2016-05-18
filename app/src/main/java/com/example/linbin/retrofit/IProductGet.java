package com.example.linbin.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Administrator on 2016/5/6.
 */
public interface IProductGet {

    @GET
    Call<ProductBean> getProduct(@Url String url);
}
