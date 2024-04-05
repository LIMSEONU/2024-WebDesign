package com.example.radiobuttontest;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout;
    RadioButton red, blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        red = findViewById(R.id.radio_red);
        blue = findViewById(R.id.radio_blue);

        red.setOnCheckedChangeListener(radioListener);
        blue.setOnCheckedChangeListener(radioListener);
    }

    private RadioButton.OnCheckedChangeListener radioListener = new RadioButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked) {
                int id = buttonView.getId();
                if (id == R.id.radio_red) {
                    layout.setBackgroundColor(Color.RED);
                } else if (id == R.id.radio_blue) {
                    layout.setBackgroundColor(Color.BLUE);
                }
            }
        }
    };
}
