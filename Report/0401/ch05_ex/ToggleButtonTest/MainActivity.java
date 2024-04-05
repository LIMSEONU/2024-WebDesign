package com.example.togglebuttontest;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview = (ImageView) findViewById(R.id.imageView);
        }
    public void onToggleClicked(View view) {
        boolean on = ((ToggleButton) view).isChecked();
        if (on){
            imageview.setImageResource(R.drawable.pic3);
        } else {
            imageview.setImageResource(0);
        }
    }
}