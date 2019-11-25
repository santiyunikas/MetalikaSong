package com.example.metalikasong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AbstractActivity extends AppCompatActivity {

    Button btnMulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract);
        btnMulai = findViewById(R.id.btnMulai);
        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbstractActivity.this, ManualActivity.class);
                startActivity(intent);
            }
        });
    }
}
