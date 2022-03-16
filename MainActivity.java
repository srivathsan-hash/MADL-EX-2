package com.example.srivathsan;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<font_size> extends AppCompatActivity {
    Button bn1;
    Button bn2;
    Button bn3;
    Button button;
    TextView display;
    Toast t;
    int font_size;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn1 = findViewById(R.id.bn1);
        bn2 = findViewById(R.id.bn2);
        bn3 = findViewById(R.id.bn3);
        button= findViewById(R.id.button);

        display = findViewById(R.id.textView);
        t = Toast.makeText(this,"buttons are working",Toast.LENGTH_LONG);
        bn1.setOnClickListener(view -> {
                font_size+=40;
                display.setTextSize(font_size);
                t.show();

        });
        button.setOnClickListener(view -> {
            font_size-=40;
            display.setTextSize(font_size);
            t.show();
        });
            bn2.setOnClickListener(view -> {
            display.setTextColor(Color.GREEN);
            t.show();
        });
        bn3.setOnClickListener(view -> {

            display.setBackgroundColor(Color.RED);
            t.show();
        });







    }
}