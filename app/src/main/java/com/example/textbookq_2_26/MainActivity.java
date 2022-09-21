package com.example.textbookq_2_26;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextTextEmailAddress);
    }

    public void click(View view) {
        if(editText.getText().toString().contains("@")) {
            textView.setText("VALID");
        } else {
            textView.setText("INVALID");
        }
    }
}