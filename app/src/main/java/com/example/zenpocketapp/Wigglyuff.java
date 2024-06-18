package com.example.zenpocketapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class Wigglyuff extends AppCompatActivity {

    private ImageView imagem3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_wigglyuff);

        imagem3 = findViewById(R.id.app_image3);
    }

    public void rodarImagem3(View v){
        Glide.with(this).load(R.drawable.wigglytuff).into(imagem3);
    }
}