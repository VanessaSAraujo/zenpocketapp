package com.example.zenpocketapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Igglybuff extends AppCompatActivity {

    private ImageView imagem2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_igglybuff);

        imagem2 = findViewById(R.id.app_image2);
    }
    public void rodarImagem2(View v) {
        Glide.with(this).load(R.drawable.igglybuff).into(imagem2);
    }
}