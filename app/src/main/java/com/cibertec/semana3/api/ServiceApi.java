package com.cibertec.semana3.api;

import com.cibertec.semana3.entity.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceApi {

        // https://jsonplaceholder.typicode.com/


        @GET("posts")

        public abstract Call<List<User>> listaUsuario();






}
