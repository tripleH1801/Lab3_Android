package com.example.lab03_android;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private ImageButton btnDo;
    private ImageButton btnDen;
    private ImageButton btnXanhDuong;
    private ImageButton btnXanh;
    private ArrayList<DienThoai> listDT;
    private TextView tvGia;
    private TextView tvMau;
    private TextView tvTen;
    private ImageView imgHinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String st =  intent.getStringExtra("key");
        Log.d("","");

        btnDo = (ImageButton) findViewById(R.id.btnDo);
        btnDen =(ImageButton) findViewById(R.id.btnDen);
        btnXanh =(ImageButton) findViewById(R.id.btnXanh);
        btnXanhDuong =(ImageButton) findViewById(R.id.btnXanhDuong);

        listDT=new ArrayList<>();
        listDT.add(new DienThoai("Đỏ","1.890.000 đ","Vsmart Đỏ",R.drawable.vs_red_a2));
        listDT.add(new DienThoai("Đen","1.790.000 đ","Vsmart Đen",R.drawable.vsmart_black_star1));
        listDT.add(new DienThoai("Xanh nhạt","1.690.000 đ","Vsmart Xanh nhạt",R.drawable.vs_bac1));
        listDT.add(new DienThoai("Xanh dương","1.790.000 đ","Vsmart Xanh dương",R.drawable.vsmart_live_xanh1));

        connectTextView();

        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMau.setText(listDT.get(0).getMau());
                tvGia.setText(listDT.get(0).getGia());
                tvTen.setText(listDT.get(0).getTen());
                imgHinh.setImageResource(listDT.get(0).getHinh());
            }
        });

        btnDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMau.setText(listDT.get(1).getMau());
                tvGia.setText(listDT.get(1).getGia());
                tvTen.setText(listDT.get(1).getTen());
                imgHinh.setImageResource(listDT.get(1).getHinh());
            }
        });

        btnXanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMau.setText(listDT.get(2).getMau());
                tvGia.setText(listDT.get(2).getGia());
                tvTen.setText(listDT.get(2).getTen());
                imgHinh.setImageResource(listDT.get(2).getHinh());
            }
        });

        btnXanhDuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMau.setText(listDT.get(3).getMau());
                tvGia.setText(listDT.get(3).getGia());
                tvTen.setText(listDT.get(3).getTen());
                imgHinh.setImageResource(listDT.get(3).getHinh());
            }
        });

    }
    public void connectTextView(){
         tvMau=findViewById(R.id.tvMau);
         tvGia=findViewById(R.id.tvGia);
         tvTen=findViewById(R.id.tvTen);
         imgHinh=findViewById(R.id.imgDt);


    }
}
