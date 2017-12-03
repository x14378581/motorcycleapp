package com.example.john_.motorcycleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton showCameras = (ImageButton) findViewById(R.id.camerabtn);
        ImageButton showFolders = (ImageButton) findViewById(R.id.folderbtn);
        ImageButton showLocation = (ImageButton) findViewById(R.id.locationbtn);
        showCameras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Cameras.class);
                startActivity(intent);
            }
        });
        showFolders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Folders.class);
                startActivity(intent);
            }
        });

        showLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Location2.class);
                startActivity(intent);
            }
        });
    }
}
