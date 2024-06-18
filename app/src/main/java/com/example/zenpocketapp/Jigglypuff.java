package com.example.zenpocketapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class Jigglypuff extends AppCompatActivity {

    private ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_jigglypuff);
        imagem = findViewById(R.id.app_image);

    }
    public void rodarImagem(View v){
        Glide.with(this).load(R.drawable.jigglypuff).into(imagem);
    }
}