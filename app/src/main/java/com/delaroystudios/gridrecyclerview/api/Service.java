package com.delaroystudios.gridrecyclerview.api;

import com.delaroystudios.gridrecyclerview.model.AlbumsResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by delaroy on 3/31/17.
 */
public interface Service {
    @GET("/albums/music.json")
    Call<AlbumsResponse> getAlbums();
}
