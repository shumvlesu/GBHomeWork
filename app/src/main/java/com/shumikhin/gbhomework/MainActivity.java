package com.shumikhin.gbhomework;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonHello);
        Button toggleButton = findViewById(R.id.toggleButton);
        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textView);

        button.setOnClickListener(view -> {
            Toast.makeText(getBaseContext(), textView.getText().toString()+" "+ editText.getText().toString() + "!", Toast.LENGTH_SHORT).show();
        });


        toggleButton.setOnClickListener(view -> {

            if (textView.getText().toString().equals("Привет")) {
                textView.setText("Пока");
            }else {
                textView.setText("Привет");
            }

        });

    }
}