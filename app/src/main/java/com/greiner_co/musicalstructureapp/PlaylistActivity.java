package com.greiner_co.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        // Set the description text for this activity
        TextView descriptionView = (TextView) findViewById(R.id.playlist_description);
        String descriptionText = getResources().getString(R.string.playlists_description);
        descriptionView.setText(descriptionText);

        // Find the view that shows play activity
        ImageButton playActivityButton = (ImageButton) findViewById(R.id.play_activity_button);

        // Set a click listener on that view
        playActivityButton.setOnClickListener((view) -> {
            Intent intent = new Intent(PlaylistActivity.this, PlayActivity.class);
            startActivity(intent);
        });

        // Find the view that shows play activity
        ImageButton coverImageButton = (ImageButton) findViewById(R.id.cover_image_button);

        // Set a click listener on that view
        coverImageButton.setOnClickListener((view) -> {
            Intent intent = new Intent(PlaylistActivity.this, PlayActivity.class);
            startActivity(intent);
        });

        // Find the button which goes back 30 seconds in playback
        ImageButton backwardButton = (ImageButton) findViewById(R.id.backward_button);

        // Set a click listener to show toast
        backwardButton.setOnClickListener((view) -> Toast.makeText(this, R.string.backward_message, Toast.LENGTH_SHORT).show());

        // Find the button which goes 30 seconds forward in playback
        ImageButton forwardButton = (ImageButton) findViewById(R.id.forward_button);

        // Set a click listener to show toast
        forwardButton.setOnClickListener((view) -> Toast.makeText(this, R.string.forward_message, Toast.LENGTH_SHORT).show());

        // Find the button which just plays the current podcast
        ImageButton playButton = (ImageButton) findViewById(R.id.play_button);

        // Set a click listener to show toast
        playButton.setOnClickListener((view) -> Toast.makeText(this, R.string.play_message, Toast.LENGTH_SHORT).show());
    }
}
