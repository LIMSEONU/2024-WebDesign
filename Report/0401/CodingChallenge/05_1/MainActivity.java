package com.example.a05_codingchallenge01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button ImageButton;
    private RadioGroup radiogroup;
    private RadioButton radioButton1, radioButton2, radioButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        ImageButton = findViewById(R.id.click);
        radiogroup = findViewById(R.id.radio1);
        radioButton1 = findViewById(R.id.button1);
        radioButton2 = findViewById(R.id.button2);
        radioButton3 = findViewById(R.id.button3);

        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radiogroup.getCheckedRadioButtonId();
                if (selectedId == radioButton1.getId()) {
                    // If "2.3.3" button is selected
                    imageView.setImageResource(R.drawable.image0);
                } else if (selectedId == radioButton2.getId()) {
                    // If "4.1" button is selected
                    imageView.setImageResource(R.drawable.image1);
                } else if (selectedId == radioButton3.getId()) {
                    // If "4.4" button is selected
                    imageView.setImageResource(R.drawable.image2);
                }
                // Set ImageView visible after selecting a radio button
                imageView.setVisibility(View.VISIBLE);
            }
        });
    }
}
