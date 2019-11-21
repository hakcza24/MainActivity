package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pay extends AppCompatActivity {
    public static final int REQUEST_GALLERY = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);


        Button buttonsucces = findViewById(R.id.button_success);
        buttonsucces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(pay.this,"Thank You For Support  ",Toast.LENGTH_SHORT).show();
                Intent buttonsucces = new Intent(pay.this,MainActivity.class);
                startActivity(buttonsucces);
            }
        });
    }
}
