package com.delaroystudios.gridrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by delaroy on 3/31/17.
 */
public class DetailActivity extends AppCompatActivity {
    TextView NumberOfSong, NameOfsong;
    ImageView imageView;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageView = (ImageView) findViewById(R.id.thumbnail_image_header);
        NameOfsong = (TextView) findViewById(R.id.name);

        NumberOfSong = (TextView) findViewById(R.id.numberofsongsdata);

        String songname = getIntent().getExtras().getString("name");
        String numofsongs = getIntent().getExtras().getString("numOfSongs");
        String thumbnail = getIntent().getExtras().getString("thumbnail");

        NameOfsong.setText(songname);
        NumberOfSong.setText(numofsongs);
        Glide.with(this)
                .load(thumbnail)
                .placeholder(R.drawable.load)
                .into(imageView);

        getSupportActionBar().setTitle("Details Activity");

    }

}
