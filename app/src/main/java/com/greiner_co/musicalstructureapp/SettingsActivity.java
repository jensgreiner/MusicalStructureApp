package com.greiner_co.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // SettingsActivity
        TextView descriptionView = (TextView) findViewById(R.id.settings_description);
        String descriptionText = getResources().getString(R.string.settings_description);
        descriptionView.setText(descriptionText);
    }
}
