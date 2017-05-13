package com.greiner_co.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView description = (TextView) findViewById(R.id.main_text_view);
        String descriptionText = getResources().getString(R.string.main_description);
        description.setText(descriptionText);
    }
}
