package com.greiner_co.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configure activities and views
        TextView descriptionView = (TextView) findViewById(R.id.main_description);
        String descriptionText = getResources().getString(R.string.main_description);
        descriptionView.setText(descriptionText);

        setupOnClickListeners();

    }

    /**
     * Initially setup all the onClickListeners to reach the activities from main
     */
    private void setupOnClickListeners() {
        // Find the view that shows settings activity
        ImageButton settingsButton = (ImageButton) findViewById(R.id.settings_button);

        // Set a click listener on that view
        settingsButton.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent);
        });

        // Find the view that shows downloads activity
        ImageButton downloadsButton = (ImageButton) findViewById(R.id.downloads_button);

        // Set a click listener on that view
        downloadsButton.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, DownloadsActivity.class);
            startActivity(intent);
        });

        // Find the view that shows discovery activity
        ImageButton addPodcastButton = (ImageButton) findViewById(R.id.add_podcast_button);

        // Set a click listener on that view
        addPodcastButton.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, DiscoveryActivity.class);
            startActivity(intent);
        });

        // Find the view that shows playlist activity
        Button playlistButton = (Button) findViewById(R.id.playlists_button);

        // Set a click listener on that view
        playlistButton.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, PlaylistActivity.class);
            startActivity(intent);
        });

        // Find the view that shows podcast details activity
        Button podcastDetailsButton = (Button) findViewById(R.id.podcasts_button);

        // Set a click listener on that view
        podcastDetailsButton.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, PodcastDetailsActivity.class);
            startActivity(intent);
        });

        // Find the view that shows play activity
        ImageButton playActivityButton = (ImageButton) findViewById(R.id.play_activity_button);

        // Set a click listener on that view
        playActivityButton.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, PlayActivity.class);
            startActivity(intent);
        });

        // Find the view that shows play activity
        ImageButton coverImageButton = (ImageButton) findViewById(R.id.cover_image_button);

        // Set a click listener on that view
        coverImageButton.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, PlayActivity.class);
            startActivity(intent);
        });

        // Find the button which shows submenu to add playlists
        ImageButton addPlaylistsButton = (ImageButton) findViewById(R.id.add_playlist_button);

        // Set a click listener to show toast
        addPlaylistsButton.setOnClickListener((view) -> Toast.makeText(this, R.string.add_playlist_message, Toast.LENGTH_SHORT).show());

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
