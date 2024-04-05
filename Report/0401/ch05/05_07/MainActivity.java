package com.example.ch05_07;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private CheckBox php, java, c, cp, python;
    private CheckBox[] checkBox;
    private TextView text;
    ArrayList<String> language;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        php = (CheckBox) findViewById(R.id.php);
        java = (CheckBox) findViewById(R.id.java);
        c = (CheckBox) findViewById(R.id.c);
        cp = (CheckBox) findViewById(R.id.cp);
        python = (CheckBox) findViewById(R.id.python);

        checkBox = new CheckBox[]{php, java, c, cp, python};
        text = findViewById(R.id.txt);
        language = new ArrayList<>();

    }
        public void onCheckBoxClicked(View view) {
            boolean checked = ((CheckBox) view).isChecked();

            if (view.getId() == R.id.php) {
                if (checked) {
                    if (!language.contains("PHP")) {
                        language.add("PHP");
                    }
                } else {
                    language.remove("PHP");
                }
            } else if (view.getId() == R.id.java) {
                if (checked) {
                    if (!language.contains("JAVA")) {
                        language.add("JAVA");
                    }
                } else {
                    language.remove("JAVA");
                }
            } else if (view.getId() == R.id.c) {
                if (checked) {
                    if (!language.contains("C")) {
                        language.add("C");
                    }
                } else {
                    language.remove("C");
                }
            } else if (view.getId() == R.id.cp) {
                if (checked) {
                    if (!language.contains("C++")) {
                        language.add("C++");
                    }
                } else {
                    language.remove("C++");
                }
            } else if (view.getId() == R.id.python) {
                if (checked) {
                    if (!language.contains("PYTHON")) {
                        language.add("PYTHON");
                    }
                } else {
                    language.remove("PYTHON");
                }
            }
        }

        public void done(View view){
        if(language.size() > 0) text.setText(language.toString());
        else text.setText("...");
    }

    public void cancel(View view){
        language = new ArrayList<>();
        for (int i = 0; i < checkBox.length; i++){
            checkBox[i].setChecked(false);
        }
        text.setText("...");
    }
}