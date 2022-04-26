package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickButton();
            }
        });
    }

    private void onClickButton() {
        Toast.makeText(this, "Second Activity", Toast.LENGTH_LONG).show();
        Log.d("SecondActivity", "onClickButton: ");
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("name", "Raman");
        startActivity(intent);
    }

}
