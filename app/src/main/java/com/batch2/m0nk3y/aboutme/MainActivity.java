package com.batch2.m0nk3y.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView img = findViewById(R.id.img);
        Button btn = findViewById(R.id.btn);
        final TextView txt = findViewById(R.id.about);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.pp);
                String id = "Hello there!\nI'm Minhaz Rahman\nID:20161012010\nNorth Western University, Khulna";
                txt.setText(id);
            }
        });
    }
}
