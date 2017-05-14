package com.greiner_co.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DownloadsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_downloads);

        // Set the description text for this activity
        TextView descriptionView = (TextView) findViewById(R.id.downloads_description);
        String descriptionText = getResources().getString(R.string.downloads_description);
        descriptionView.setText(descriptionText);
    }
}
