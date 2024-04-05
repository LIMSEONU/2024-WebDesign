package com.example.ch05_06;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView img;
    RadioButton dog, cat, bird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        img = findViewById(R.id.imageview);
        dog = findViewById(R.id.dog);
        cat = findViewById(R.id.cat);
        bird = findViewById(R.id.bird);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (dog.isChecked()) img.setImageResource(R.drawable.dog);
                else if (cat.isChecked()) img.setImageResource(R.drawable.cat);
                else if (bird.isChecked()) img.setImageResource(R.drawable.bird);
            }

        });
    }
}