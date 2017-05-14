package com.greiner_co.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        // Set the description text for this activity
        TextView descriptionView = (TextView) findViewById(R.id.playlist_description);
        String descriptionText = getResources().getString(R.string.playlists_description);
        descriptionView.setText(descriptionText);
    }
}
