package com.example.qthjen.floatingactionbutton;

import android.Manifest;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab, fabDelete, fabPhoto, fabPlus;
    boolean showAndHide = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fabDelete = (FloatingActionButton) findViewById(R.id.fabDelete);
        fabPhoto = (FloatingActionButton) findViewById(R.id.fabPhoto);
        fabPlus = (FloatingActionButton) findViewById(R.id.fabPlus);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (showAndHide == false) {
                    fabShow();
                    showAndHide = true;
                } else {
                    fabHide();
                    showAndHide = false;
                }

            }
        });

        fabDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Delete", Toast.LENGTH_SHORT).show();
            }
        });

        fabPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Photo", Toast.LENGTH_SHORT).show();
            }
        });

        fabPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Plus", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void fabShow() {

        fabPhoto.show();
        fabDelete.show();
        fabPlus.show();

    }

    private void fabHide() {

        fabPhoto.hide();
        fabDelete.hide();
        fabPlus.hide();

    }

}
