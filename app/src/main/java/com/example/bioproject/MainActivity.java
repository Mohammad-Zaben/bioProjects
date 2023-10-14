package com.example.bioproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtHobbies;
    private Button btnSave;
    private EditText edtHobbies;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHobbies = findViewById(R.id.textHobbeis);
        btnSave = findViewById(R.id.button4);
        edtHobbies = findViewById(R.id.editHobbies);

        btnSave.setOnClickListener(v -> {
            String hobbies = edtHobbies.getText().toString();
            if (!hobbies.isEmpty()) {
                txtHobbies.setText(hobbies);
                txtHobbies.setVisibility(TextView.VISIBLE);
            }
        });
    }
}