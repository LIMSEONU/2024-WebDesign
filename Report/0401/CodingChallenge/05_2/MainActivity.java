package com.example.a05_codingchallenge02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private LinearLayout todoListLayout;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoListLayout = findViewById(R.id.ListLayout);
        editText = findViewById(R.id.edittext);
        Button addButton = findViewById(R.id.button1);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTodo();
            }
        });
    }

    private void addTodo() {
        String todoText = editText.getText().toString().trim();
        if (!todoText.isEmpty()) {
            CheckBox checkBox = new CheckBox(this);
            checkBox.setText(todoText);
            todoListLayout.addView(checkBox);
            editText.setText("");
        }
    }
}
