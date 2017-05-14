package com.greiner_co.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PodcastDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast_details);

        // Set the description text for this activity
        TextView descriptionView = (TextView) findViewById(R.id.podcasts_description);
        String descriptionText = getResources().getString(R.string.podcast_details_description);
        descriptionView.setText(descriptionText);
    }
}
