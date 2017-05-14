package com.greiner_co.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        // Set the description text for this activity
        TextView descriptionView = (TextView) findViewById(R.id.play_activity_description);
        String descriptionText = getResources().getString(R.string.play_description);
        descriptionView.setText(descriptionText);
    }
}
