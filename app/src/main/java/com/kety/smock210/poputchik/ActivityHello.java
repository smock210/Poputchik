package com.kety.smock210.poputchik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityHello extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        Button btnSearch = (Button) findViewById(R.id.poimat);
        Button btnDelo = (Button) findViewById(R.id.podvesti);
        Button btnMaps = (Button) findViewById(R.id.mapsOpen);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(ActivityHello.this, ZayacActivity.class);
                    startActivity(intent);

            }
        });

        btnDelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(ActivityHello.this, PaputkaActivity.class);
                    startActivity(intent);

            }
        });

        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityHello.this, MapsActivity.class);
                startActivity(intent);

            }
        });
    }
}
