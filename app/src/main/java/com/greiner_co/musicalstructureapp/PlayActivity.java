package com.greiner_co.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        // Set the description text for this activity
        TextView descriptionView = (TextView) findViewById(R.id.play_activity_description);
        String descriptionText = getResources().getString(R.string.play_description);
        descriptionView.setText(descriptionText);

        // Find the button which goes back 30 seconds in playback
        ImageButton backwardButton = (ImageButton) findViewById(R.id.backward_button_single);

        // Set a click listener to show toast
        backwardButton.setOnClickListener((view) -> Toast.makeText(this, R.string.backward_message, Toast.LENGTH_SHORT).show());

        // Find the button which goes 30 seconds forward in playback
        ImageButton forwardButton = (ImageButton) findViewById(R.id.forward_button_single);

        // Set a click listener to show toast
        forwardButton.setOnClickListener((view) -> Toast.makeText(this, R.string.forward_message, Toast.LENGTH_SHORT).show());

        // Find the button which just plays the current podcast
        ImageButton playButton = (ImageButton) findViewById(R.id.play_button_single);

        // Set a click listener to show toast
        playButton.setOnClickListener((view) -> Toast.makeText(this, R.string.play_message, Toast.LENGTH_SHORT).show());
    }
}
