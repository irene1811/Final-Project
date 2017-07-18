package com.example.chohaeun.invisilinkchildapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GetLocation extends AppCompatActivity {

    Button btnGetLoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_location);

        Button btn = (Button)findViewById(R.id.GetLoc);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GetLocation.this, MapsActivity.class));
            }
        });
    }
}
