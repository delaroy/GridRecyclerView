package com.delaroystudios.gridrecyclerview.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by delaroy on 3/31/17.
 */
public class AlbumsResponse {

    @SerializedName("Album")
    @Expose
    private List<Album> albums;

    public List<Album> getAlbums(){
        return albums;
    }
    public void setAlbums(List<Album>albums){
        this.albums = albums;
    }
}
