package com.example.lab03_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnChonMau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView price=findViewById(R.id.txPrice);
        SpannableString string = new SpannableString("1.790.000 đ");
        string.setSpan(new StrikethroughSpan(), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        price.setText(string);

        btnChonMau =(Button) findViewById(R.id.btnChonMau);

        btnChonMau.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("key","value");
                startActivity(intent);
            }
        });
    }
}