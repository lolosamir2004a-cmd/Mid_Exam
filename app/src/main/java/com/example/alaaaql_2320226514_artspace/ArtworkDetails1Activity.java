package com.example.alaaaql_2320226514_artspace;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.alaaaql_2320226514_artspace.databinding.ActivityArtworkDetails1Binding;

public class ArtworkDetails1Activity extends AppCompatActivity {
    public static ActivityArtworkDetails1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityArtworkDetails1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();

        String text =intent.getStringExtra(MainActivity.SEND_INTENT_MESSAGE_KEY);


        binding.textArtWork1ditils.setText(text);

        binding.btnVisitWebsite.setOnClickListener(v -> {
            Uri webpage = Uri.parse("https://artsandculture.google.com");
            startActivity(new Intent(Intent.ACTION_VIEW, webpage));
        });

        binding.btnBack.setOnClickListener(v -> finish());
    }
}